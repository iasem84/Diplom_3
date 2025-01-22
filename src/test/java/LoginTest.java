import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import practicum.api.User;
import practicum.pageobject.LoginPage;
import practicum.pageobject.MainPage;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static org.junit.Assert.assertEquals;
import static practicum.Constants.PERSONAL_ACCOUNT_PAGE_URL;

public class LoginTest extends BaseUITest{

    private User user;

    @Before
    public void initUser() {
        user = new User();
        user.createUser();
    }

    @After
    public void cleanUp() {
        user.loginUser();
        user.deleteUser();
    }

    @DisplayName("User login test")
    @Description("User can login from personal account button on main page")
    @Test
    public void userLoginTest() {
        MainPage mainPage = new MainPage();
        mainPage.personalAccountButtonClick();

        LoginPage loginPage = new LoginPage();
        loginPage.login(user.getEmail(), user.getPassword());

        mainPage.personalAccountButtonClick();
        assertEquals(PERSONAL_ACCOUNT_PAGE_URL, driver().url());
    }
}
