package UITests;

import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.ProductModalWindow;
import utils.SetUp;


import static com.codeborne.selenide.Selenide.*;

public class ProductsDisplayingTest extends SetUp {

    @Test
    public void testAppearanceProductInTheRecentlyViewedArea() {

        MainPage mainPage = new MainPage();
        ProductModalWindow productModalWindow = new ProductModalWindow();


        mainPage.clickOnFirstProduct();
        productModalWindow.closeModalWindow();
        refresh();
        mainPage.assertCountOfProductsInRecentlyViewedArea(1);
    }

}
