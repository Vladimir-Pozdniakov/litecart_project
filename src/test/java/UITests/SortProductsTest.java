package UITests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.ProductsPage;
import utils.ConfigProperties;

import static com.codeborne.selenide.Selenide.open;

public class SortProductsTest {

    @BeforeTest
    public static void setUp(){

        Configuration.startMaximized=true;
        open(ConfigProperties.getTestProperty("url"));
    }

    @Test
    public void testSortProductsByName() {

        MainPage mainPage = new MainPage();
        ProductsPage productsPage = new ProductsPage();

        mainPage
                .clickCategoriesItem("RubberSSS Ducks");

        productsPage
                .clickSortButton("Name")
                .assertSortingProductsByName();
    }

    @Test
    public void testSortProductsByPrice() {

        MainPage mainPage = new MainPage();
        ProductsPage productsPage = new ProductsPage();

        mainPage
                .clickCategoriesItem("RubberSSS Ducks");

        productsPage
                .clickSortButton("Price")
                .assertSortingProductsByPrice();
    }

}
