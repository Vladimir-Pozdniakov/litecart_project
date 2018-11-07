package helper;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class SetUp {

    @BeforeMethod(alwaysRun = true)
    public static void setUp(){

        Configuration.startMaximized=true;
        open(ConfigProperties.getTestProperty("url"));
    }
}
