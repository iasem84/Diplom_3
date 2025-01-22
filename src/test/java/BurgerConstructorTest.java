import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import practicum.pageobject.MainPage;

import static org.junit.Assert.assertEquals;

public class BurgerConstructorTest extends BaseUITest {

    private MainPage mainPage;

    @Before
    public void init() {
        mainPage = new MainPage();
    }

    @DisplayName("Is buns tab active test")
    @Description("Checking buns tab is active")
    @Test
    public void isBunsTabActiveTest() {
        mainPage.saucesButtonClick();
        mainPage.bunsButtonClick();
        String expectedText = "Булки";
        assertEquals("Булки - являются активной вкладкой", expectedText, mainPage.getTabsText());
    }

    @DisplayName("Is sauces tab active test")
    @Description("Checking sauces tab is active")
    @Test
    public void isSaucesTabActiveTest() {
        mainPage.saucesButtonClick();
        String expectedText = "Соусы";
        assertEquals("Соусы - являются активной вкладкой", expectedText, mainPage.getTabsText());
    }

    @DisplayName("Is fillings tab active test")
    @Description("Checking fillings tab is active")
    @Test
    public void isFillingsTabActiveTest() {
        mainPage.fillingsButtonClick();
        String expectedText = "Начинки";
        assertEquals("Начинки - являются активной вкладкой", expectedText, mainPage.getTabsText());
    }
}
