package com.userbug;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;


public class CreateCompanyApi {

    @BeforeEach
    void setup(){
        RestAssured.baseURI = "http://users.bugred.ru";
    }
    private void ensureUser(String email, String name) {
        given()
                .contentType(ContentType.JSON)
                .body(Map.of("email", email, "name", name, "password", "123456"))
                .when()
                .post("/tasks/rest/doregister")
                .then()
                .statusCode(200);
    }

    @Test
    void сreateCompanyTest(){
        // подготовка — делаем, чтобы API принял company_users и owner
        String owner = "owner_qa@example.com";
        String u1 = "user1_qa@example.com";
        String u2 = "user2_qa@example.com";
        ensureUser(owner, "Owner QA");
        ensureUser(u1, "User One");
        ensureUser(u2, "User Two");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(Map.of(
                          "company_name", "Алкоголики и тунеядцы",
                          "company_type", "ООО",
                          "company_users", List.of(u1, u2),
                          "email_owner", owner
                        ))
                .when()
                .post("/tasks/rest/createcompany")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        assertNotEquals("error", response.path("type"), "API вернул ошибку на создание компании");
        Integer companyId = response.path("id_company");
        assertNotNull(companyId, "id_company не вернулся");
        assertTrue(companyId > 0, "id_company должен быть > 0");
    }
}
