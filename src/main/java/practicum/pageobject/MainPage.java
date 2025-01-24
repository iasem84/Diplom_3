package practicum.pageobject;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import practicum.elements.ButtonElement;
import practicum.elements.LinkElement;

public class MainPage {

    private static final String LOGIN_BUTTON_LOCATOR = ".//button[contains(text(), 'Войти')]";
    private static final String PERSONAL_ACCOUNT_BUTTON_LOCATOR = ".//p[contains(text(), 'Личный Кабинет')]";
    private static final String BUNS_BUTTON_LOCATOR = ".//span[contains(text(), 'Булки')]/parent::div";
    private static final String SAUCES_BUTTON_LOCATOR = ".//span[contains(text(), 'Соусы')]/parent::div";
    private static final String FILLINGS_BUTTON_LOCATOR = ".//span[contains(text(), 'Начинки')]/parent::div";
    private static final String ACTIVE_TAB_LOCATOR = ".//div[contains(@class, 'current')]/span";

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
        Selenide.Wait().until(ExpectedConditions.attributeContains(By.xpath(BUNS_BUTTON_LOCATOR),
                "class", "current"));
    }

    @Step("Sauces button click")
    public void saucesButtonClick() {
        ButtonElement saucesButton = new ButtonElement(SAUCES_BUTTON_LOCATOR);
        saucesButton.clickButton();
        Selenide.Wait().until(ExpectedConditions.attributeContains(By.xpath(SAUCES_BUTTON_LOCATOR),
                "class", "current"));
    }

    @Step("Fillings button click")
    public void fillingsButtonClick() {
        ButtonElement fillingsButton = new ButtonElement(FILLINGS_BUTTON_LOCATOR);
        fillingsButton.clickButton();
        Selenide.Wait().until(ExpectedConditions.attributeContains(By.xpath(FILLINGS_BUTTON_LOCATOR),
                "class", "current"));
    }

    @Step("Get text of active tab")
    public String getTabsText() {
        LinkElement tabElement = new LinkElement(ACTIVE_TAB_LOCATOR);
        return tabElement.getLinkText();
    }
}
