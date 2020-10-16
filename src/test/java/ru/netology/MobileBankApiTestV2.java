package ru.netology;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MobileBankApiTestV2 {
    @Test
    void shouldPost() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")

                .when()
                .post("/post")

                .then()
                .statusCode(300)
                .header("Content-Type", "application/json; charset=utf-8")
                .contentType(ContentType.JSON)
        ;
    }
}