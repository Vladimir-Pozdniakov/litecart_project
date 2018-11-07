package uiTests;

import org.testng.annotations.Test;
import pageObjects.MainElements;
import pageObjects.MainPage;
import pageObjects.RegionalSettingsWindow;
import helper.DataProviderSource;
import helper.SetUp;


public class RegionalSettingsTest extends SetUp {

    @Test(dataProvider = "currencyValue",
            dataProviderClass = DataProviderSource.class,
            groups = {"functional"})
    public void testCurrencySelection(String currency, String currencyType) {

        RegionalSettingsWindow regionalSettingsWindow = new RegionalSettingsWindow();
        MainPage mainPage = new MainPage();


        MainElements.clickChangeRegionalSettingsLink();

        regionalSettingsWindow
                .selectCurrency(currency)
                .clickSaveButton();

        mainPage.assertCurrencyTypeOfProducts(currencyType);

        MainElements.assertDisplayingCurrency(currency);

    }

    @Test(dataProvider = "countryValue",
            dataProviderClass = DataProviderSource.class,
            groups = {"functional"})
    public void testCountrySelection(String country, String region) {

        RegionalSettingsWindow regionalSettingsWindow = new RegionalSettingsWindow();

        MainElements.clickChangeRegionalSettingsLink();

        regionalSettingsWindow
                .selectCountry(country)
                .clickSaveButton();

        MainElements.clickChangeRegionalSettingsLink();

        regionalSettingsWindow
                .assertSelectedCountryIs(country)
                .closeModalWindow();
    }

}
