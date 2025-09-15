package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class MainPage {

    //Параметры главной страницы:

    private final SelenideElement signUpLink = $(By.xpath("//*[@id=\"signin2\"]"));
    private final SelenideElement loginLink = $(By.xpath("//*[@id=\"login2\"]"));


    //Методы главной страницы

    public void clickSignUp() {
        signUpLink.click();
    }

    public void clickLogin() {
        loginLink.click();
    }

    public void findWelcome(String username) {
        $(byText("Welcome " + username)).shouldBe(visible);
    }

}

