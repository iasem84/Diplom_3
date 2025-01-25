package practicum.pageobject;

import io.qameta.allure.Step;
import practicum.elements.LinkElement;

public class ForgotPasswordPage {

    private static final String LOGIN_LINK_LOCATOR = ".//a[@href='/login']";

    @Step("Login link click")
    public void loginLinkClick() {
        LinkElement loginLink = new LinkElement(LOGIN_LINK_LOCATOR);
        loginLink.clickLink();
    }
}
