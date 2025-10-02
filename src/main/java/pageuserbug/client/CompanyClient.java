package pageuserbug.client;

import pageuserbug.model.request.CreateCompanyRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CompanyClient {

    public Response createCompany(CreateCompanyRequest body) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/tasks/rest/createcompany");
    }
}
