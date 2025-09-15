package com.saucedemo.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class BaseTestConfig2 {
    @BeforeEach
    void setup() { open("https://www.saucedemo.com/"); }

    @AfterEach
    void teardown() { closeWebDriver(); }
}
