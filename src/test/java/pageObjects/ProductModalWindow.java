package pageObjects;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class ProductModalWindow {

    private final WebElement CLOSE_BUTTON = $(".featherlight-close-icon");


    public MainPage closeModalWindow() {

        CLOSE_BUTTON.click();
        return new MainPage();
    }
}
