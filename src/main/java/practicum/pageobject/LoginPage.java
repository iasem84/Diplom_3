package practicum.pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import practicum.elements.ButtonElement;
import practicum.elements.InputElement;
import practicum.elements.LinkElement;

import static practicum.pageobject.Constants.INPUT_EMAIL_FIELD_LOCATOR;
import static practicum.pageobject.Constants.INPUT_PASSWORD_FIELD_LOCATOR;

public class LoginPage {

    private String goButtonLocator = ".//button[contains(text(), 'Войти')]";
    private String registerLinkLocator = ".//a[contains(text(), 'Зарегистрироваться')]";

    @Step("Go button click")
    public void goButtonClick() {
        ButtonElement goButton = new ButtonElement(goButtonLocator);
        goButton.clickButton();
    }

    @Step("Register link click")
    public void registerLinkClick() {
        LinkElement registerLink = new LinkElement(registerLinkLocator);
        registerLink.clickLink();
    }

    @Step("Input email to name field")
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
