package practicum.pageobject;

import io.qameta.allure.Step;
import practicum.elements.ButtonElement;
import practicum.elements.InputElement;
import practicum.elements.LinkElement;

import static practicum.Constants.*;

public class LoginPage {

    @Step("Login button click")
    public void loginButtonClick() {
        ButtonElement loginButton = new ButtonElement(LOGIN_BUTTON_LOCATOR);
        loginButton.clickButton();
    }

    @Step("Register link click")
    public void registerLinkClick() {
        LinkElement registerLink = new LinkElement(REGISTER_LINK_LOCATOR);
        registerLink.clickLink();
    }

    @Step("Forgot password link click")
    public void forgotPasswordLinkClick() {
        LinkElement forgotPasswordLink = new LinkElement(FORGOT_PASSWORD_LINK_LOCATOR);
        forgotPasswordLink.clickLink();
    }

    @Step("Input email to email field")
    public void setEmailField(String email) {
        InputElement nameInput = new InputElement(INPUT_EMAIL_FIELD_LOCATOR);
        nameInput.clearAndSetValue(email);
    }

    @Step("Input password to password field")
    public void setPasswordField(String password) {
        InputElement nameInput = new InputElement(INPUT_PASSWORD_FIELD_LOCATOR);
        nameInput.clearAndSetValue(password);
    }

    @Step("Checking is enabled login button")
    public boolean isEnabledLoginButton() {
        ButtonElement buttonElement = new ButtonElement(LOGIN_BUTTON_LOCATOR);
        return buttonElement.isEnabledButton();
    }

    @Step("Login")
    public void login(String email, String password) {
        setEmailField(email);
        setPasswordField(password);
        loginButtonClick();
    }
}
