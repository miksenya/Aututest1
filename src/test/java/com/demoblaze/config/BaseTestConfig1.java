package com.demoblaze.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class BaseTestConfig1 {
    @BeforeEach
    void setup() {
        open("https://www.demoblaze.com");
    }

    @AfterEach
    void teardown() {
        closeWebDriver();
    }
}
//Первый коммит