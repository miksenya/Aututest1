// src/main/java/pageuserbug/scenarios/UserScenariosSimple.java
package pageuserbug.scenarios;

import io.restassured.response.Response;
import pageuserbug.client.UserClient;
import pageuserbug.model.request.CreateUserWithTasksRequest;
import pageuserbug.model.request.TaskDto;
import pageuserbug.support.DataGen;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class UserTaskScenarios {
    private final UserClient userClient = new UserClient();

    public Response createUserWithTasks_default() {
        String uniq  = DataGen.uniq();
        CreateUserWithTasksRequest req = new CreateUserWithTasksRequest(
                "cu_" + uniq + "@mail.com",
                "Рест_" + uniq,
                List.of(
                        new TaskDto("Подготовить отчёт", "Собрать метрики"),
                        new TaskDto("Позвонить клиенту", "Уточнить требования")
                ),
                "Стрельба из лука, Настолки",
                "адрес 1",
                "123456789012",
                "m",
                "01.01.1900",
                "11.11.2000"
        );

        return userClient.createUserWithTasks(req)
                .then()
                .log().all()
                .statusCode(200)
                .body("type", not(equalTo("error")))
                .extract().response();
    }
}
