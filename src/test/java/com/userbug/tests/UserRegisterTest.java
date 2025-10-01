package com.userbug.tests;

import com.userbug.base.BaseApiTest;
import com.userbug.client.UserClient;
import com.userbug.model.request.DoRegisterRequest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegisterTest extends BaseApiTest {

    private final UserClient userClient = new UserClient();

    @Test
    void doRegisterTest() {
        DoRegisterRequest req = new DoRegisterRequest(
                "3224ewfdwdf@bk.ru",
                "Roman6",
                "2"
        );

        Response response = userClient.doRegister(req)
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        String name = response.jsonPath().getString("name");
        assertEquals("Имена не совпадают", "Roman6", name);
    }
}
