import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import practicum.pageobject.ForgotPasswordPage;
import practicum.pageobject.LoginPage;
import practicum.pageobject.MainPage;
import practicum.pageobject.RegisterPage;
import static com.codeborne.selenide.WebDriverRunner.driver;

import static org.junit.Assert.assertEquals;
import static practicum.Constants.LOGIN_PAGE_URL;

public class LoginButtonTest extends BaseUITest {

    private LoginPage loginPage;
    private MainPage mainPage;

    @Before
    public void init() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
    }

    @DisplayName("Login button on main page test")
    @Description("Check login button on main page")
    @Test
    public void loginButtonOnMainPageTest() {
        mainPage.loginButtonClick();
        assertEquals(LOGIN_PAGE_URL, driver().url());
    }

    @DisplayName("Personal account button on main page test")
    @Description("Check Personal account button on main page")
    @Test
    public void personalAccountButtonOnMainPageTest() {
        mainPage.personalAccountButtonClick();
        assertEquals(LOGIN_PAGE_URL, driver().url());
    }

    @DisplayName("Login link on register page test")
    @Description("Check login link on register page")
    @Test
    public void loginLinkOnRegisterPageTest() {
        mainPage.personalAccountButtonClick();
        loginPage.registerLinkClick();

        RegisterPage registerPage = new RegisterPage();
        registerPage.loginLinkClick();
        assertEquals(LOGIN_PAGE_URL, driver().url());
    }

    @DisplayName("Login link on forgot password page test")
    @Description("Check login link on forgot password page")
    @Test
    public void loginLinkOnForgotPasswordPageTest() {
        mainPage.personalAccountButtonClick();
        loginPage.forgotPasswordLinkClick();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.loginLinkClick();
        assertEquals(LOGIN_PAGE_URL, driver().url());
    }
}
