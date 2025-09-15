package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class LoginModalPage {

    //Параметры для окна входа:

    private final SelenideElement usernameInput = $(By.xpath("//*[@id=\"loginusername\"]"));
    private final SelenideElement passwordInput = $(By.xpath("//*[@id=\"loginpassword\"]"));
    private final SelenideElement submitButton = $(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));

    //Методы для окна входа:

    public void typeUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }

}
