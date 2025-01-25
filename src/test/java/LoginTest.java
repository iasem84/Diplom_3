import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import practicum.User;
import practicum.pageobject.LoginPage;
import practicum.pageobject.MainPage;
import practicum.pageobject.ProfilePage;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseUITest{

    private User user;

    @Before
    public void initUser() {
        user = new User();
        user.createUser(user.getEmail(), user.getPassword(), user.getName());
    }

    @After
    public void cleanUp() {
        user.loginUser(user.getEmail(), user.getPassword());
        user.deleteUser(user.getToken());
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
        ProfilePage profilePage = new ProfilePage();
        assertTrue(profilePage.isEnabledLogoutButton());
    }
}
