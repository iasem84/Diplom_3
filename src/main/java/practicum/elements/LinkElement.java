package practicum.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LinkElement {
    private final SelenideElement linkElement;

    public LinkElement(String locator) {
        this.linkElement = $(new By.ByXPath(locator));
    }

    public void clickLink() {
        linkElement.scrollIntoView(false);
        linkElement.shouldBe(enabled);
        linkElement.click();
    }

    public String getLinkText() {
        linkElement.shouldBe(enabled);
        return linkElement.text();
    }
}
