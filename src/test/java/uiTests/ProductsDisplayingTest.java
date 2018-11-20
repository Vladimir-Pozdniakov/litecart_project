package uiTests;

import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.ProductModalWindow;
import helper.SetUp;

public class ProductsDisplayingTest extends SetUp {

    //Check that recently viewed product is appears in the viewed area
    @Test(groups = {"functional"})
    public void testAppearanceProductInTheRecentlyViewedArea() {
        MainPage mainPage = new MainPage();
        ProductModalWindow productModalWindow = new ProductModalWindow();

        mainPage.clickOnFirstProduct();
        productModalWindow.closeModalWindow();
        mainPage.assertCountOfProductsInRecentlyViewedArea(1);
    }

}
