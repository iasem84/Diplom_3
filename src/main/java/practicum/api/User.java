package practicum.api;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static practicum.pageobject.Constants.MAIN_PAGE_URL;

public class User {
    protected String email;
    protected String password;
    protected String name;
    protected String json;
    protected Faker faker;

    @Step("Create user")
    public void createUser() {
        faker = new Faker();
        email = faker.internet().emailAddress();
        password = faker.internet().password(6, 8);
        name = faker.name().firstName();

        json = "{\"email\": \"" + email + "\", \"password\": \"" + password + "\", \"name\": \"" + name + "\" }";

        RestAssured.baseURI = MAIN_PAGE_URL;
        given()
                .header("Content-type", "application/json")
                .body(json)
                .post("/api/auth/register");
    }

    @Step("Login user")
    public void loginUser() {
        json = "{\"email\": \"" + email + "\", \"password\": \"" + password + "\"}";

        RestAssured.baseURI = MAIN_PAGE_URL;
        given()
                .header("Content-type", "application/json")
                .body(json)
                .post("/api/auth/login");
    }

    public static void main(String[] args) {
        User user = new User();
        user.createUser();
        System.out.println(user.email + " " + user.name);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
