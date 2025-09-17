package pagesauce;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement usernameInput = $(By.xpath("//*[@id=\"user-name\"]"));
    private final SelenideElement passwordInput = $(By.xpath("//*[@id=\"password\"]"));
    private final SelenideElement loginButton = $(By.xpath("//*[@id=\"login-button\"]"));

    public void typeUsername(String name){
        usernameInput.sendKeys(name);
    }
    public void typePassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();
    }
}

//Коммит Алексея
//Третий пробный коммит