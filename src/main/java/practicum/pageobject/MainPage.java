package practicum.pageobject;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import practicum.elements.ButtonElement;
import practicum.elements.LinkElement;

import static practicum.Constants.*;

public class MainPage {

    @Step("Personal account button click")
    public void personalAccountButtonClick() {
        ButtonElement personalAccountButton = new ButtonElement(PERSONAL_ACCOUNT_BUTTON_LOCATOR);
        personalAccountButton.clickButton();
    }

    @Step("Login button click")
    public void loginButtonClick() {
        ButtonElement loginButton = new ButtonElement(LOGIN_BUTTON_LOCATOR);
        loginButton.clickButton();
    }

    @Step("Buns button click")
    public void bunsButtonClick() {
        ButtonElement bunsButton = new ButtonElement(BUNS_BUTTON_LOCATOR);
        bunsButton.clickButton();
        Configuration.timeout = 3000;
    }

    @Step("Sauces button click")
    public void saucesButtonClick() {
        ButtonElement saucesButton = new ButtonElement(SAUCES_BUTTON_LOCATOR);
        saucesButton.scrollAndClickButton();
        Configuration.timeout = 6000;
    }

    @Step("Fillings button click")
    public void fillingsButtonClick() {
        ButtonElement fillingsButton = new ButtonElement(FILLINGS_BUTTON_LOCATOR);
        fillingsButton.scrollAndClickButton();
        Configuration.timeout = 4000;
    }

    @Step("Get text of active tab")
    public String getTabsText() {
        Configuration.timeout = 4000;
        LinkElement tabElement = new LinkElement(ACTIVE_TAB_LOCATOR);
        return tabElement.getLinkText();
    }
}
