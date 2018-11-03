package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainElements {

    private static SelenideElement changeLink = $(".change");
    private static SelenideElement regionalCurrency = $(".currency");

    public MainElements() {

    }


    public static RegionalSettingsWindow clickChangeRegionalSettingsLink() {
        changeLink.click();
        return new RegionalSettingsWindow();
    }

    public static void assertDisplayingCurrency(String currency) {
        regionalCurrency.shouldHave(Condition.text(currency));
    }
}
