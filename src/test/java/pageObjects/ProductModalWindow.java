package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ProductModalWindow {
    private SelenideElement closeButton = $(".featherlight-close-icon");

    public MainPage closeModalWindow() {
        closeButton.click();
        return new MainPage();
    }
}