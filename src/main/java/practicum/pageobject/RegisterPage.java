package practicum.pageobject;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import practicum.elements.ButtonElement;
import practicum.elements.InputElement;

import static practicum.pageobject.Constants.*;

public class RegisterPage {

    @Step("Register button click")
    public void registerButtonClick() {
        ButtonElement registerButton = new ButtonElement(REGISTER_BUTTON_LOCATOR);
        registerButton.clickButton();
    }

    @Step("Input name to name field")
    public void setNameField(String name) {
        InputElement nameInput = new InputElement(INPUT_NAME_FIELD_LOCATOR);
        nameInput.clearAndSetValue(name);
    }

    @Step("Input email to email field")
    public void setEmailField(String name) {
        InputElement nameInput = new InputElement(INPUT_EMAIL_FIELD_LOCATOR);
        nameInput.clearAndSetValue(name);
    }

    @Step("Input password to password field")
    public void setPasswordField(String name) {
        InputElement nameInput = new InputElement(INPUT_PASSWORD_FIELD_LOCATOR);
        nameInput.clearAndSetValue(name);
    }
}
