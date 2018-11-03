package UITests;

import org.testng.annotations.Test;
import pageObjects.MainElements;
import pageObjects.MainPage;
import pageObjects.RegionalSettingsWindow;
import utils.DataProviderSource;
import utils.SetUp;


public class RegionalSettingsTest extends SetUp {

    @Test(dataProvider = "currencyValue", dataProviderClass = DataProviderSource.class)
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

    @Test(dataProvider = "countryValue", dataProviderClass = DataProviderSource.class)
    public void testCountrySelection(String country, String region) {

        RegionalSettingsWindow regionalSettingsWindow = new RegionalSettingsWindow();

        MainElements.clickChangeRegionalSettingsLink();
        regionalSettingsWindow
                .selectCountry(country)
                .clickSaveButton();
        MainElements.clickChangeRegionalSettingsLink();
        regionalSettingsWindow
                .assertCountryIs(country)
                .closeModalWindow();

        System.out.println(country);
    }

}
