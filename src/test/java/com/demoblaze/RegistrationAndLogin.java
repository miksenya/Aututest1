package com.demoblaze;

import com.demoblaze.config.BaseTestConfig1;
import org.junit.jupiter.api.Test;
import pagedemoblaze.LoginModalPage;
import pagedemoblaze.MainPage;
import pagedemoblaze.SignUpModalPage;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationAndLogin extends BaseTestConfig1 {

    @Test
    public void testSignUpAndLogin() {
        MainPage mainPage = new MainPage();        SignUpModalPage signUp = new SignUpModalPage();
        LoginModalPage login = new LoginModalPage();

        mainPage.clickSignUp();
        signUp.typeUsername("Vovan4ik");
        signUp.typePassword("12345");
        signUp.clickSubmit();
        signUp.closeModal();
        signUp.clickClose();

        mainPage.clickLogin();
        login.typeUsername("Vovan4ik");
        login.typePassword("12345");
        login.clickSubmit();
        mainPage.findWelcome("Vovan4ik");
        sleep(3000);
    }

    /*@Test
    public void Test100(){
        pagedemoblaze.MainPage mainPage = new pagedemoblaze.MainPage();
        mainPage.clickSignUpButton();

        $(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("Vovan4ik");
        $(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("12345");
        $(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        switchTo().alert().accept();
        $(By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span")).click();
        $(By.xpath("//*[@id=\"login2\"]")).click();
        $(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("Vovan4ik");
        $(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("12345");
        $(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        sleep(5000);
        $(byText("Welcome Vovan4ik")).shouldBe(visible);
        sleep(5000);*/
}
