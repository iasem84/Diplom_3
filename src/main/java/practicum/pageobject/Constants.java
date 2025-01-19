package practicum.pageobject;

public class Constants {
    public static final String INPUT_EMAIL_FIELD_LOCATOR = ".//label[contains(text(), 'Email')]/following::input[1]";
    public static final String INPUT_PASSWORD_FIELD_LOCATOR = ".//label[contains(text(), 'Пароль')]/following::input[1]";
    public static final String INPUT_NAME_FIELD_LOCATOR = ".//label[contains(text(), 'Имя')]/following::input[1]";

    public static final String REGISTER_BUTTON_LOCATOR = ".//button[contains(text(), 'Зарегистрироваться')]";

    public static final String MAIN_PAGE_URL = "https://stellarburgers.nomoreparties.site/";
    public static final String LOGIN_PAGE_URL = MAIN_PAGE_URL + "login";
 }
