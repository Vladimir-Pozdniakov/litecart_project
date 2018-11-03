package utils;

import org.testng.annotations.DataProvider;

public class DataProviderSource {

    @DataProvider
    public Object[][] currencyValue() {
        return new Object[][]{
                {"USD", "$"},
                {"EUR", "€"}
        };
    }

    @DataProvider
    public Object[][] countryValue() {
        return new Object[][]{
            {"Canada", "Manitoba"},
            {"United States", "Idaho"},
        };
    }
}
