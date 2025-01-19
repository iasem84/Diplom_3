package practicum.elements;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class ButtonElementCollection {

    ElementsCollection buttonElementCollection;

    public ButtonElementCollection(String locator) {
        buttonElementCollection = $$(new By.ByXPath(locator));
    }

    public void findVisibleButtonAndClick() {
        ButtonElement buttonElement = new ButtonElement(buttonElementCollection.findBy(visible));
        buttonElement.clickButton();
    }
}
