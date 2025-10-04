// src/test/java/com/userbug/tests/CreateUserWithTasksTest.java
package com.userbug.tests;

import com.userbug.tests.base.BaseApiTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import pageuserbug.scenarios.UserTaskScenarios;

public class CreateUserWithTasksTest extends BaseApiTest {
    private final UserTaskScenarios scenarios = new UserTaskScenarios();

    @Test
    void createUser_default() {
        Response resp = scenarios.createUserWithTasks_default();
        // при желании — точечные доп.проверки здесь
    }
}
