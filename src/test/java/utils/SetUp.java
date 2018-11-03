package utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class SetUp {

    @BeforeTest
    public static void setUp(){

        Configuration.startMaximized=true;
        open(ConfigProperties.getTestProperty("url"));
    }
}
