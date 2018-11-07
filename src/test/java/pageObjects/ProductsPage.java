package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {

    public ProductsPage clickSortButton(String byType) {

        try {
            $(By.linkText(byType)).click();
        } catch (Error error) {
            try {
                $(By.xpath("//span[text()='" + byType + "']")).shouldBe(Condition.enabled);
            } catch (Error e) {
                throw new org.openqa.selenium.NoSuchElementException("Element not found");
            }
        }
        return this;
    }

    public void assertSortingProductsByName() {

        Object[] actualOrderOfProducts = $$(".products .name").texts().toArray();
        Object[] expectedOrderOfProducts = actualOrderOfProducts.clone();
        Arrays.sort(expectedOrderOfProducts);
        Assert.assertEquals(actualOrderOfProducts, expectedOrderOfProducts, "Incorrect sorting by Name: Products not in alphabetical order");

    }

    public void assertSortingProductsByPrice() {

        Object[] actualOrderOfProducts = $$(".price-wrapper *:last-child").texts().toArray();
        Object[] expectedOrderOfProducts = actualOrderOfProducts.clone();
        Arrays.sort(expectedOrderOfProducts);
        Assert.assertEquals(actualOrderOfProducts, expectedOrderOfProducts, "Incorrect sorting by Price");
    }
}
