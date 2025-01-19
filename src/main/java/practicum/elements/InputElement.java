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

    public InputElement(SelenideElement selenideElement) {
        inputElement = selenideElement;
    }

    public void clearAndSetValue(String inputValue) {
        inputElement.shouldBe(enabled).clear();
        inputElement.setValue(inputValue);
    }

    public void setValue(String inputValue) {
        inputElement.shouldBe(enabled).setValue(inputValue);
    }

    public void setValueIfIsEmpty(String inputValue) {
        if (inputElement.getValue().isEmpty()) {
            setValue(inputValue);
        }
    }

    public String getValue(String logMessage) {
        return inputElement.getValue();
    }
}
