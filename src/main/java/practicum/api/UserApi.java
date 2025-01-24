package practicum.api;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import practicum.model.LoginData;
import practicum.model.UserData;

import static io.restassured.RestAssured.given;
import static practicum.Constants.*;

public class UserApi extends RestApi {

    @Step("Create user")
    public void createUser(UserData userData) {
        given()
                .spec(requestSpecification())
                .and()
                .body(userData)
                .when()
                .post(CREATE_USER_URI)
                .then();
    }

    @Step("Login user")
    public ValidatableResponse loginUser(LoginData loginData) {
        return given()
                .spec(requestSpecification())
                .and()
                .body(loginData)
                .when()
                .post(LOGIN_USER_URI)
                .then();
    }

    @Step("Delete user")
    public void deleteUser(String token) {
        given()
                .header("Authorization", token)
                .spec(requestSpecification())
                .when()
                .delete(DELETE_USER_URI);
    }
}
