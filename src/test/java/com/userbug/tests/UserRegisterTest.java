package com.userbug.tests;

import com.userbug.tests.base.BaseApiTest;
import pageuserbug.scenarios.RegisterUserScenario;
import org.junit.jupiter.api.Test;

public class UserRegisterTest extends BaseApiTest {

    @Test
    void doRegister_minimal() {
        new RegisterUserScenario().run(); // всё создаёт и проверяет внутри
    }
}
