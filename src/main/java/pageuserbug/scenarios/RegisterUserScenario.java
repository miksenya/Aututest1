package pageuserbug.scenarios;

import pageuserbug.client.UserClient;
import pageuserbug.model.request.DoRegisterRequest;
import pageuserbug.support.DataGen;

import static org.hamcrest.Matchers.equalTo;

public class RegisterUserScenario {
    private final UserClient userClient = new UserClient();

    /** Создаёт уникального пользователя и проверяет имя в ответе. */
    public void run() {
        String uniq  = DataGen.uniq();                    // уникальный мэил
        String email = "autoreg_" + uniq + "@mail.com";   // меняем префикс
        String name  = "Roman4";                          // меняем имя тут
        String pass  = "2";

        var req = new DoRegisterRequest(email, name, pass);

        userClient.doRegister(req)
                .then()
                .log().all()
                .statusCode(200)
                .body("name", equalTo(name));             // проверка тут
    }
}
