package helper;

import org.testng.annotations.DataProvider;

public class DataProviderSource {

    //Set the currency values used in the tests.
    @DataProvider
    public Object[][] currencyValue() {
        return new Object[][]{
                {"USD", "$"},
                {"EUR", "€"}
        };
    }

    //Set the country and region values used in the tests.
    @DataProvider
    public Object[][] countryValue() {
        return new Object[][]{
            {"Canada", "Manitoba"},
            {"United States", "Idaho"},
        };
    }
}
