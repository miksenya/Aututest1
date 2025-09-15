package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class SignUpModalPage {

    //Параметры для окна регистрации:

    private final SelenideElement usernameInput = $(By.xpath("//*[@id=\"sign-username\"]"));
    private final SelenideElement passwordInput = $(By.xpath("//*[@id=\"sign-password\"]"));
    private final SelenideElement submitButton = $(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
    private final SelenideElement closeMenu = $(By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span"));

    //Методы для окна регистрации:

    public void typeUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void closeModal() {
        switchTo().alert().accept();
    }

    public void clickClose() {
        closeMenu.click();
    }

}
