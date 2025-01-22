package practicum.api;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static practicum.Constants.*;

public class User extends RestApi {

    private final String email;
    private final String password;
    private final String name;
    private String json;
    private String token;

    public User() {
        Faker faker = new Faker();
        email = faker.internet().emailAddress();
        password = faker.internet().password();
        name = faker.name().firstName();
    }

    @Step("Create user")
    public void createUser() {
        json = "{\"email\": \"" + email + "\", \"password\": \"" + password + "\", \"name\": \"" + name + "\" }";

        given()
                .spec(requestSpecification())
                .and()
                .body(json)
                .when()
                .post(CREATE_USER_URI)
                .then();
    }

    @Step("Login user")
    public void loginUser() {
        json = "{\"email\": \"" + email + "\", \"password\": \"" + password + "\"}";

        ValidatableResponse response = given()
                .spec(requestSpecification())
                .and()
                .body(json)
                .when()
                .post(LOGIN_USER_URI)
                .then();
        token = response.extract().body().jsonPath().getString("accessToken");
    }

    @Step("Delete user")
    public void deleteUser() {
        given()
                .header("Authorization", token)
                .spec(requestSpecification())
                .when()
                .delete(DELETE_USER_URI);
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
