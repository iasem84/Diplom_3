import org.junit.After;
import org.junit.Test;
import practicum.api.User;
import practicum.pageobject.LoginPage;
import practicum.pageobject.MainPage;
import practicum.pageobject.RegisterPage;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static org.junit.Assert.assertEquals;
import static practicum.pageobject.Constants.LOGIN_PAGE_URL;
import static practicum.pageobject.Constants.MAIN_PAGE_URL;

public class RegistrationTest extends BaseUITest {

//    @After
//    public void cleanUp() {
//
//    }

    @Test
    public void buttonClickTest() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        mainPage.personalAccountButtonClick();
        loginPage.registerLinkClick();
        User user = new User();
        user.createUser();

        RegisterPage registerPage = new RegisterPage();
        registerPage.setNameField(user.getName());
        registerPage.setEmailField(user.getEmail());
        registerPage.setPasswordField(user.getPassword());
        registerPage.registerButtonClick();

        assertEquals(LOGIN_PAGE_URL, driver().getCurrentFrameUrl());

    }


}
