import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static practicum.browser.Browser.initDriver;
import static practicum.Constants.MAIN_PAGE_URL;

public class BaseUITest {

    @Before
    public void startUp() throws IOException {
        initDriver();
        Configuration.timeout = 4000;
        open(MAIN_PAGE_URL);
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
