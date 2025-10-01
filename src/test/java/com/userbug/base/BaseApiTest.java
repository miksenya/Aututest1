package com.userbug.base;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseApiTest {
    @BeforeAll
    static void baseSetup() {
        RestAssured.baseURI = System.getProperty("baseUrl", "http://users.bugred.ru");
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
    }
}