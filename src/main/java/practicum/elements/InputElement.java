package practicum.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class InputElement {
    SelenideElement inputElement;

    public InputElement(String locator) {
        this.inputElement = $(new By.ByXPath(locator));
    }

    public void clearAndSetValue(String inputValue) {
        inputElement.shouldBe(enabled).clear();
        inputElement.setValue(inputValue);
    }

    public String getText() {
        return inputElement.getText();
    }
}
