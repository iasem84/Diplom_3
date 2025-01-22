package practicum;

public class Constants {
    public static final String INPUT_EMAIL_FIELD_LOCATOR = ".//label[contains(text(), 'Email')]/following::input[1]";
    public static final String INPUT_PASSWORD_FIELD_LOCATOR = ".//label[contains(text(), 'Пароль')]/following::input[1]";
    public static final String INPUT_NAME_FIELD_LOCATOR = ".//label[contains(text(), 'Имя')]/following::input[1]";
    public static final String INCORRECT_PASSWORD_ERROR_LOCATOR = ".//p[contains(@class, 'input__error')]";

    public static final String REGISTER_BUTTON_LOCATOR = ".//button[contains(text(), 'Зарегистрироваться')]";
    public static final String LOGIN_BUTTON_LOCATOR = ".//button[contains(text(), 'Войти')]";
    public static final String PERSONAL_ACCOUNT_BUTTON_LOCATOR = ".//p[contains(text(), 'Личный Кабинет')]";
    public static final String LOGOUT_BUTTON_LOCATOR = ".//button[contains(text(), 'Выход')]";
    public static final String BUNS_BUTTON_LOCATOR = ".//span[contains(text(), 'Булки')]";
    public static final String SAUCES_BUTTON_LOCATOR = ".//span[contains(text(), 'Соусы')]";
    public static final String FILLINGS_BUTTON_LOCATOR = ".//span[contains(text(), 'Начинки')]";
    public static final String ACTIVE_TAB_LOCATOR = ".//div[contains(@class, 'current')]/span";

    public static final String LOGIN_LINK_LOCATOR = ".//a[@href='/login']";
    public static final String REGISTER_LINK_LOCATOR = ".//a[@href='/register']";
    public static final String FORGOT_PASSWORD_LINK_LOCATOR = ".//a[@href='/forgot-password']";
    public static final String STELLAR_BURGER_LINK_LOCATOR = ".//div[contains(@class, 'AppHeader')]/a";
    public static final String CONSTRUCTOR_LINK_LOCATOR = ".//ul[contains(@class, 'AppHeader')]/li[1]/a";

    public static final String MAIN_PAGE_URL = "https://stellarburgers.nomoreparties.site/";
    public static final String LOGIN_PAGE_URL = MAIN_PAGE_URL + "login";
    public static final String PERSONAL_ACCOUNT_PAGE_URL = MAIN_PAGE_URL + "account/profile";

    public static final String CREATE_USER_URI = "/api/auth/register";
    public static final String LOGIN_USER_URI = "/api/auth/login";
    public static final String DELETE_USER_URI = "/api/auth/user";
 }
