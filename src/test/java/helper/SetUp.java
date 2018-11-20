package helper;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.open;

public class SetUp {

    //Open URL in browser with maximum window size before each test
    @BeforeMethod(alwaysRun = true)
    public static void setUp() throws FileNotFoundException {
        Configuration.startMaximized=true;
        open(ConfigProperties.getTestProperty("url"));
    }
}
