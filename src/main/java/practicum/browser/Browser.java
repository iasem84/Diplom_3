package practicum.browser;

import com.codeborne.selenide.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Browser {

    public static void initDriver() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/test/resources/browser.properties"));
        String browserProperty = properties.getProperty("testBrowser");

        BrowserType browserType = BrowserType.valueOf(browserProperty);
        switch (browserType){
            case CHROME:
                Configuration.browser = "CHROME";
                break;
            case YANDEX:
                //Указать путь для Яндекс драйвера
//                System.setProperty("webdriver.chrome.driver", "/Users/assem/Desktop/Diplom_Asem_Prokhorova_12/yandexdriver");
                Configuration.browser = "CHROME";
                break;
            default:
                throw new RuntimeException("Browser undefined");
        }
    }
}
