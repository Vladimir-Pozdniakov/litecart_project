package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RegionalSettingsWindow {

    private SelenideElement closeButton = $(".featherlight-close-icon");
    private SelenideElement currencyDropDown = $(By.name("currency_code"));
    private SelenideElement countryDropDown = $(By.name("country_code"));
    private SelenideElement zoneDropDown = $(By.name("zone_code"));
    private SelenideElement radioButtonDisplayPrice = $(".radio");
    private SelenideElement saveButton = $("button[name='save']");

    public void closeModalWindow() {

        closeButton.click();
    }

    public RegionalSettingsWindow selectCurrency(String currency) {
        new Select(currencyDropDown).selectByValue(currency);
        return this;
    }

    public RegionalSettingsWindow selectCountry(String country) {
        new Select(countryDropDown).selectByVisibleText(country);

        return this;
    }

    public RegionalSettingsWindow selectZone(String zone) {
        new Select(zoneDropDown).selectByValue(zone);
        return this;
    }

    public RegionalSettingsWindow selectRadioButton(String radioButton) {

        radioButtonDisplayPrice.selectRadio(radioButton);
        return this;
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public RegionalSettingsWindow assertSelectedCountryIs(String country) {

        countryDropDown.$(By.xpath("//option[text()='" + country + "']")).shouldBe(selected);
        return this;
    }
}
