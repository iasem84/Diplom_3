package practicum.pageobject;

import io.qameta.allure.Step;
import practicum.elements.LinkElement;

import static practicum.Constants.LOGIN_LINK_LOCATOR;

public class ForgotPasswordPage {

    @Step("Login link click")
    public void loginLinkClick() {
        LinkElement loginLink = new LinkElement(LOGIN_LINK_LOCATOR);
        loginLink.clickLink();
    }
}
