package practicum.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class ButtonElement {
    SelenideElement buttonElement;

    public ButtonElement(String locator) {
        this.buttonElement = $(new By.ByXPath(locator));
    }

    public ButtonElement(WebElement element) {
        buttonElement = (SelenideElement) element;
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
