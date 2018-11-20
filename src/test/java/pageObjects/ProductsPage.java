package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {

    public ProductsPage clickSortButton(String byType) throws NoSuchElementException {
        try {
            $(By.linkText(byType)).click();
        } catch (Error error) {
            checkElementIsEnabled(byType);
        }
        return this;
    }

    private void checkElementIsEnabled(String byType) {
        try {
            $(By.xpath("//span[text()='" + byType + "']")).shouldBe(Condition.enabled);
        } catch (Error e) {
            throw new NoSuchElementException("Element not found");
        }
    }

    public void assertSortingProductsByName() {
        assertSortingProductCollection(".products .name",
                "Incorrect sorting by Name: Products not in alphabetical order");
    }

    public void assertSortingProductsByPrice() {
        assertSortingProductCollection(".price-wrapper *:last-child",
                "Incorrect sorting by Price");
    }

    private void assertSortingProductCollection(String selector, String message) {
        Object[] actualOrderOfElements = $$(selector).texts().toArray();
        Object[] expectedOrderOfElements = actualOrderOfElements.clone();

        Arrays.sort(expectedOrderOfElements);
        Assert.assertEquals(actualOrderOfElements, expectedOrderOfElements, message);
    }
}
