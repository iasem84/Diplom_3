package practicum.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ButtonElement {
    private final SelenideElement buttonElement;

    public ButtonElement(String locator) {
        buttonElement = $(new By.ByXPath(locator));
    }

    public void clickButton() {
        buttonElement.shouldBe(enabled);
        buttonElement.scrollIntoView(true);
        buttonElement.click();
    }

    public void scrollAndClickButton() {
        buttonElement.shouldBe(enabled);
        buttonElement.scrollIntoView(false);
        buttonElement.click();
    }

    public boolean isEnabledButton() {
        return buttonElement.isEnabled();
    }
}
