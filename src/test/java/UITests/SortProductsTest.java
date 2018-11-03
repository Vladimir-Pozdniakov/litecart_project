package UITests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.ProductModalWindow;
import utils.ConfigProperties;


import static com.codeborne.selenide.Selenide.*;

public class ProductsDisplayingTest {

    @BeforeTest
    public static void setUp(){

        Configuration.startMaximized=true;
        open(ConfigProperties.getTestProperty("url"));
    }

    @Test
    public void test_Appearance_Product_In_The_Recently_Viewed_Area() {

        MainPage mainPage = new MainPage();
        ProductModalWindow productModalWindow = new ProductModalWindow();


        mainPage.clickOnFirstProduct();
        productModalWindow.closeModalWindow();
        refresh();
        mainPage.assertCountOfProductsInRecentlyViewedArea(1);
    }

}
