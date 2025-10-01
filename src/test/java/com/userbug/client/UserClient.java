package com.userbug.client;

import com.userbug.model.request.CreateUserWithTasksRequest;
import com.userbug.model.request.DoRegisterRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {

    public Response doRegister(DoRegisterRequest body) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/tasks/rest/doregister");
    }

    public void ensureUser(String email, String name) {
        given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\""+email+"\",\"name\":\""+name+"\",\"password\":\"123456\"}")
                .when()
                .post("/tasks/rest/doregister")
                .then()
                .statusCode(200);
    }
    public Response createUserWithTasks(CreateUserWithTasksRequest body) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/tasks/rest/createuserwithtasks");
    }
}
