package practicum.pageobject;

import io.qameta.allure.Step;
import practicum.elements.ButtonElement;
import practicum.elements.InputElement;
import practicum.elements.LinkElement;

public class RegisterPage {

    private static final String REGISTER_BUTTON_LOCATOR = ".//button[contains(text(), 'Зарегистрироваться')]";
    private static final String LOGIN_LINK_LOCATOR = ".//a[@href='/login']";
    private static final String INPUT_NAME_FIELD_LOCATOR = ".//label[contains(text(), 'Имя')]/following::input[1]";
    private static final String INPUT_EMAIL_FIELD_LOCATOR = ".//label[contains(text(), 'Email')]/following::input[1]";
    private static final String INPUT_PASSWORD_FIELD_LOCATOR = ".//label[contains(text(), 'Пароль')]/following::input[1]";
    private static final String INCORRECT_PASSWORD_ERROR_LOCATOR = ".//p[contains(@class, 'input__error')]";

    @Step("Register button click")
    public void registerButtonClick() {
        ButtonElement registerButton = new ButtonElement(REGISTER_BUTTON_LOCATOR);
        registerButton.scrollAndClickButton();
    }

    @Step("Login link click")
    public void loginLinkClick() {
        LinkElement loginLink = new LinkElement(LOGIN_LINK_LOCATOR);
        loginLink.clickLink();
    }

    @Step("Input name to name field")
    public void setNameField(String name) {
        InputElement nameInput = new InputElement(INPUT_NAME_FIELD_LOCATOR);
        nameInput.clearAndSetValue(name);
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

    @Step("Get error message")
    public String getErrorMessage() {
        InputElement errorText = new InputElement(INCORRECT_PASSWORD_ERROR_LOCATOR);
        return errorText.getText();
    }

    @Step("Registration")
    public void registration(String name, String email, String password) {
        setNameField(name);
        setEmailField(email);
        setPasswordField(password);
        registerButtonClick();
    }
}
