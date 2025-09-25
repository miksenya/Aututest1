package com.userbug;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class UserBugApi {
    @BeforeEach
    void setup() {
        RestAssured.baseURI = "http://users.bugred.ru";
    }

    @Test
    void doRegisterTest(){
        Response response = (Response) given()
                .header("Content-Type", "application/json")
                .body("""
                        {
                            "email": "asdasda@bk.ru",
                            "name": "Roman2",
                            "password": "2"
                        }""")
                .when()
                .post("/tasks/rest/doregister")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        String name = response.jsonPath().getString("name");
        assertEquals("Имена не совпадают","Butya", name);


    }
}
