package com.userbug.tests;

import com.userbug.tests.base.BaseApiTest;
import pageuserbug.scenarios.CreateCompanyScenario;
import org.junit.jupiter.api.Test;

public class CreateCompanyTest extends BaseApiTest {

    @Test
    void createCompany_minimal() {
        new CreateCompanyScenario().run(); // все предусловия, вызовы и проверки – внутри
    }
}
