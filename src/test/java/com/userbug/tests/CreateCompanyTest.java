package com.userbug.tests;

import com.userbug.tests.base.BaseApiTest;
import pageuserbug.client.CompanyClient;
import pageuserbug.client.UserClient;
import pageuserbug.model.request.CreateCompanyRequest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCompanyTest extends BaseApiTest {

    private final UserClient userClient = new UserClient();
    private final CompanyClient companyClient = new CompanyClient();

    @Test
    void createCompanyTest() {
        // подготовка — делаем, чтобы API принял company_users и owner
        String owner = "owner_qa@example.com";
        String u1 = "user1_qa@example.com";
        String u2 = "user2_qa@example.com";

        userClient.ensureUser(owner, "Owner QA");
        userClient.ensureUser(u1, "User One");
        userClient.ensureUser(u2, "User Two");

        // тело запроса через DTO
        var req = new CreateCompanyRequest(
                "Алкоголики и тунеядцы",
                "ООО",
                List.of(u1, u2),
                owner
        );

        Response response = companyClient.createCompany(req)
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
