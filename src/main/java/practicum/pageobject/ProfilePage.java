package practicum.pageobject;

import io.qameta.allure.Step;
import practicum.elements.ButtonElement;
import practicum.elements.LinkElement;

public class ProfilePage {

    private static final String STELLAR_BURGER_LINK_LOCATOR = ".//div[contains(@class, 'AppHeader')]/a";
    private static final String CONSTRUCTOR_LINK_LOCATOR = ".//ul[contains(@class, 'AppHeader')]/li[1]/a";
    private static final String LOGOUT_BUTTON_LOCATOR = ".//button[contains(text(), 'Выход')]";

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

    @Step("Checking is enabled logout button")
    public boolean isEnabledLogoutButton() {
        ButtonElement logoutButton = new ButtonElement(LOGOUT_BUTTON_LOCATOR);
        return logoutButton.isEnabledButton();
    }
}
