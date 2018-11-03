package pageObjects;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final WebElement FIRST_PRODUCT = $("#box-campaign-products div[data-id='1']");
    private final ElementsCollection COUNT_OF_PRODUCTS_IN_RECENTLY_VIEW_AREA = $$(".col-xs-3");

    public MainPage clickOnFirstProduct() {

        FIRST_PRODUCT.click();
        return this;
    }

    public MainPage assertCountOfProductsInRecentlyViewedArea(int i) {

        COUNT_OF_PRODUCTS_IN_RECENTLY_VIEW_AREA.shouldHaveSize(i);
        return this;
    }

    public ProductsPage clickCategoriesItem(String category) {

        $(By.xpath("//div[@id='box-category-tree'] //a[contains(text(),'" + category + "')]")).click();
        return new ProductsPage();
    }


}
