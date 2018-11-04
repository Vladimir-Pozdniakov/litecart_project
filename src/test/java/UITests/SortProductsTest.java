package UITests;

import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.ProductsPage;
import utils.SetUp;

public class SortProductsTest extends SetUp {

    @Test(groups = "functional")
    public void testSortProductsByName() {

        MainPage mainPage = new MainPage();
        ProductsPage productsPage = new ProductsPage();

        mainPage
                .clickCategoriesItem("Rubber Ducks");

        productsPage
                .clickSortButton("Name")
                .assertSortingProductsByName();
    }

    @Test(groups = "functional")
    public void testSortProductsByPrice() {

        MainPage mainPage = new MainPage();
        ProductsPage productsPage = new ProductsPage();

        mainPage
                .clickCategoriesItem("Rubber Ducks");

        productsPage
                .clickSortButton("Price")
                .assertSortingProductsByPrice();
    }

}
