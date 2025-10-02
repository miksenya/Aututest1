package com.userbug.tests;

import com.userbug.tests.base.BaseApiTest;
import pageuserbug.client.UserClient;
import pageuserbug.model.request.DoRegisterRequest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegisterTest extends BaseApiTest {

    private final UserClient userClient = new UserClient();

    @Test
    void doRegisterTest() {
        DoRegisterRequest req = new DoRegisterRequest(
                "4ewfdwdf@bk.ru",
                "Roman3",
                "2"
        );

        Response response = userClient.doRegister(req)
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        String name = response.jsonPath().getString("name");
        assertEquals("Roman3", name, "Имена не совпадают");
    }
}
