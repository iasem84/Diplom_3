import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import practicum.User;
import practicum.api.UserApi;
import practicum.pageobject.LoginPage;
import practicum.pageobject.MainPage;
import practicum.pageobject.RegisterPage;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static practicum.Constants.LOGIN_PAGE_URL;

public class RegistrationTest extends BaseUITest {

    private LoginPage loginPage;
    private RegisterPage registerPage;
    private User user;

    @Before
    public void init() {
        MainPage mainPage = new MainPage();
        mainPage.personalAccountButtonClick();

        loginPage = new LoginPage();
        loginPage.registerLinkClick();

        registerPage = new RegisterPage();
        user = new User();
    }

    @After
    public void cleanUp() {
        if (driver().url().equals(LOGIN_PAGE_URL)) {
            user.loginUser(user.getEmail(), user.getPassword());
            user.deleteUser(user.getToken());
        }
    }

    @DisplayName("User registration test")
    @Description("User can be created with correct data")
    @Test
    public void userRegistrationTest() {
        registerPage.registration(user.getName(), user.getEmail(), user.getPassword());
        assertTrue(loginPage.isEnabledLoginButton());
    }

    @DisplayName("Check incorrect password message test")
    @Description("Checking error message text")
    @Test
    public void checkIncorrectPasswordMessageTest() {
        registerPage.registration(user.getName(), user.getEmail(), "11111");
        String expectedMessage = "Некорректный пароль";
        assertEquals(expectedMessage, registerPage.getErrorMessage());
    }
}
