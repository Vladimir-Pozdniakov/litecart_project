package uiTests;

import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.ProductModalWindow;
import helper.SetUp;


import static com.codeborne.selenide.Selenide.*;

public class ProductsDisplayingTest extends SetUp {

    @Test(groups = {"functional"})
    public void testAppearanceProductInTheRecentlyViewedArea() {

        MainPage mainPage = new MainPage();
        ProductModalWindow productModalWindow = new ProductModalWindow();


        mainPage.clickOnFirstProduct();
        productModalWindow.closeModalWindow();
        refresh();
        mainPage.assertCountOfProductsInRecentlyViewedArea(1);
    }

}
