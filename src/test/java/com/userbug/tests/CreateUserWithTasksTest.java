package com.userbug.tests;

import com.userbug.tests.base.BaseApiTest;
import pageuserbug.client.UserClient;
import pageuserbug.model.request.CreateUserWithTasksRequest;
import pageuserbug.model.request.TaskDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class CreateUserWithTasksTest extends BaseApiTest {

    private final UserClient userClient = new UserClient();

    @Test
    void createUserTest() {
        String uniq  = String.valueOf(System.currentTimeMillis());
        String email = "cu_" + uniq + "@mail.com";
        String name  = "Рест_" + uniq;

        List<TaskDto> tasks = List.of(
                new TaskDto("Подготовить отчёт", "Собрать метрики"),
                new TaskDto("Позвонить клиенту", "Уточнить требования")
        );

        var req = new CreateUserWithTasksRequest(
                email,
                name,
                tasks,
                "Стрельба из лука, Настолки",
                "адрес 1",
                "123456789012",   // ИНН — 12 цифр
                "m",
                "01.01.1900",
                "11.11.2000"
        );

        Response response = userClient.createUserWithTasks(req)
                .then()
                .log().all()
                .statusCode(200)
                .body("type", not(equalTo("error")))
                .extract().response();
    }
}
