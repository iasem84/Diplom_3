package practicum.pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import practicum.elements.ButtonElement;

import java.time.Duration;

public class MainPage {

//    private WebDriver driver;

    private String personalAccountButtonLocator = ".//p[contains(text(), 'Личный Кабинет')]";

    //кнопка заказать внизу страницы
    private By downOrderButton = By.xpath(".//div[contains(@class, 'Home_FinishButton__1_cWm')]/button");

    //раскрывающийся список в разделе "Вопросы о важном"
    private static final String FAQ_QUESTION_PATTERN = ".//div[contains(@class, 'accordion__button') and contains(text(), '%s')]";
    private By answerLocator = By.xpath(".//div[contains(@class, 'accordion__panel') and not(@hidden)]/p");

    //кнопка закрытия блока cookies "Да все привыкли"
    private By shutDownCookiesButton = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

//    public MainPage(WebDriver driver) {
//        this.driver = driver;
//    }

//    public MainPage() {
//    }

//    public MainPage openMainPage() {
//        driver.get(MAIN_PAGE_URL);
//        return this;
//    }

    @Step("Personal account button click")
    public void personalAccountButtonClick() {
        ButtonElement personalAccountButton = new ButtonElement(personalAccountButtonLocator);
        personalAccountButton.clickButton();
    }
//
//    public void downOrderButtonClick() {
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(downOrderButton));
//        shutDownCookiesButtonClick();
//        driver.findElement(downOrderButton).click();
//    }
//
//    public void clickFAQQuestion(String questionMessage) {
//        String questionLocator = String.format(FAQ_QUESTION_PATTERN, questionMessage);
//
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath(questionLocator)));
//
//        shutDownCookiesButtonClick();
//
//        WebElement questionElement = driver.findElement(By.xpath(questionLocator));
//        scrollToElement(questionElement);
//        questionElement.click();
//    }
//
//    public String getFAQAnswer() {
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.visibilityOfElementLocated(answerLocator));
//        return driver.findElement(answerLocator).getText();
//    }
//
//    private void scrollToElement(WebElement element) {
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView", element);
//    }
//
//    private void shutDownCookiesButtonClick() {
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(shutDownCookiesButton));
//
//        driver.findElement(shutDownCookiesButton).click();
//    }
}
