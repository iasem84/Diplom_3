import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import practicum.User;
import practicum.api.UserApi;
import practicum.pageobject.LoginPage;
import practicum.pageobject.MainPage;
import practicum.pageobject.ProfilePage;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static practicum.Constants.MAIN_PAGE_URL;

public class ProfilePageButtonsTest extends BaseUITest {

    private User user;
    private ProfilePage profilePage;
    private LoginPage loginPage;

    @Before
    public void init() {
        user = new User();
        user.createUser(user.getEmail(), user.getPassword(), user.getName());

        MainPage mainPage = new MainPage();
        mainPage.personalAccountButtonClick();

        loginPage = new LoginPage();
        loginPage.login(user.getEmail(), user.getPassword());

        profilePage = new ProfilePage();
        mainPage.personalAccountButtonClick();
    }

    @After
    public void cleanUp() {
        user.loginUser(user.getEmail(), user.getPassword());
        user.deleteUser(user.getToken());
    }

    @DisplayName("Stellar burger logo click test")
    @Description("Checking transition by logo link on profile page")
    @Test
    public void stellarBurgerLogoClickTest() {
        profilePage.logoLinkClick();
        assertEquals(MAIN_PAGE_URL, driver().url());
    }

    @DisplayName("Constructor button test")
    @Description("Checking transition by constructor button on profile page")
    @Test
    public void constructorButtonTest() {
        profilePage.constructorLinkClick();
        assertEquals(MAIN_PAGE_URL, driver().url());
    }

    @DisplayName("Logout button test")
    @Description("Checking logout button on profile page")
    @Test
    public void logoutButtonTest() {
        profilePage.logoutButtonClick();
        assertTrue(loginPage.isEnabledLoginButton());
    }
}

