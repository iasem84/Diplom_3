package practicum;

import com.github.javafaker.Faker;
import io.restassured.response.ValidatableResponse;
import lombok.Getter;
import practicum.api.UserApi;
import practicum.model.LoginData;
import practicum.model.UserData;

@Getter
public class User {

    private final String email;
    private final String password;
    private final String name;
    private UserData userData;
    private UserApi userApi;
    private LoginData loginData;
    private String token;

    public User() {
        Faker faker = new Faker();
        email = faker.internet().emailAddress();
        password = faker.internet().password();
        name = faker.name().firstName();
    }

    public void createUser(String email, String password, String name) {
        userData = new UserData(email, password, name);
        userApi = new UserApi();
        userApi.createUser(userData);
    }

    public void loginUser(String email, String password) {
        loginData = new LoginData(email, password);
        userApi = new UserApi();
        ValidatableResponse response = userApi.loginUser(loginData);
        token = response.extract().body().jsonPath().getString("accessToken");
    }

    public void deleteUser(String token) {
        userApi = new UserApi();
        userApi.deleteUser(token);
    }
}
