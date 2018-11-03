package pageObjects;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement firstProduct = $("#box-campaign-products div[data-id='1']");
    private ElementsCollection countOfProductsInRecentlyViewArea = $$(".col-xs-3");
    private SelenideElement productPriceValue = $(".product .price-wrapper");

    public MainPage() {

    }
    public MainPage clickOnFirstProduct() {

        firstProduct.click();
        return this;
    }

    public MainPage assertCountOfProductsInRecentlyViewedArea(int i) {

        countOfProductsInRecentlyViewArea.shouldHaveSize(i);
        return this;
    }

    public ProductsPage clickCategoriesItem(String category) {

        $(By.xpath("//div[@id='box-category-tree'] //a[contains(text(),'" + category + "')]")).click();
        return new ProductsPage();
    }


    public MainPage assertCurrencyTypeOfProducts(String currencyType) {

        productPriceValue.shouldHave(Condition.text(currencyType));
        return this;
    }
}
