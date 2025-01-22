package practicum.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static practicum.Constants.MAIN_PAGE_URL;

public class RestApi {

    protected RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(MAIN_PAGE_URL)
                .setContentType(ContentType.JSON)
                .build()
                .log().all();
    }
}
