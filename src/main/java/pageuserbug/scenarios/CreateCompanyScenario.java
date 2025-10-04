package pageuserbug.scenarios;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import pageuserbug.client.CompanyClient;
import pageuserbug.client.UserClient;
import pageuserbug.model.request.CreateCompanyRequest;
import pageuserbug.support.CompanySteps;
import pageuserbug.support.DataGen;

import java.util.List;

public class CreateCompanyScenario {
    private final UserClient userClient = new UserClient();
    private final CompanyClient companyClient = new CompanyClient();
    private final CompanySteps companySteps = new CompanySteps(userClient);

    public void run() {
        String owner = "owner_qa@example.com";
        String u1    = "user1_qa@example.com";
        String u2    = "user2_qa@example.com";
        String name  = "Алкоголики и тунеядцы " + DataGen.uniq();

        // предусловия
        companySteps.ensureMembersExist(owner, u1, u2);

        // запрос
        var req = new CreateCompanyRequest(name, "ООО", List.of(u1, u2), owner);

        // проверка внутри сценария
        companyClient.createCompany(req)
                .then()
                .log().all()
                .statusCode(200)
                .body("type", Matchers.not(Matchers.equalTo("error")))
                .body("id_company", Matchers.greaterThan(0));
    }
}
