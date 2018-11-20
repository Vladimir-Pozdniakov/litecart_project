package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainElements {
    private SelenideElement changeLink = $(".change");
    private SelenideElement regionalCurrency = $(".currency");

    public RegionalSettingsWindow clickChangeRegionalSettingsLink() {
        changeLink.click();
        return new RegionalSettingsWindow();
    }

    public void assertDisplayingCurrency(String currency) {
        regionalCurrency.shouldHave(Condition.text(currency));
    }
}