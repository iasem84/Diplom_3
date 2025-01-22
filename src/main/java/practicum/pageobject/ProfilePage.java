package practicum.pageobject;

import io.qameta.allure.Step;
import practicum.elements.ButtonElement;
import practicum.elements.LinkElement;

import static practicum.Constants.*;

public class ProfilePage {

    @Step("Stellar burger logo link click")
    public void logoLinkClick() {
        LinkElement logoLink = new LinkElement(STELLAR_BURGER_LINK_LOCATOR);
        logoLink.clickLink();
    }

    @Step("Constructor link click")
    public void constructorLinkClick() {
        LinkElement constructorLink = new LinkElement(CONSTRUCTOR_LINK_LOCATOR);
        constructorLink.clickLink();
    }

    @Step("Logout button click")
    public void logoutButtonClick() {
        ButtonElement logoutButton = new ButtonElement(LOGOUT_BUTTON_LOCATOR);
        logoutButton.clickButton();
    }
}
