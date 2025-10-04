package pageuserbug.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class RequestConfigTest {
    private RequestConfigTest() {}

    private static final RequestSpecification JSON = new RequestSpecBuilder()
            .setBaseUri(System.getProperty("baseUrl", "http://users.bugred.ru"))
            .setContentType(ContentType.JSON)
            .build();

    public static RequestSpecification json() { return JSON; }
}
