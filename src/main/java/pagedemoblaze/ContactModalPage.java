package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ContactModalPage {

    //Параметры:
    private final SelenideElement emailInput = $(By.xpath("//*[@id=\"recipient-email\"]"));
    private final SelenideElement nameInput = $(By.xpath("//*[@id=\"recipient-name\"]"));
    private final SelenideElement messageInput = $(By.xpath("//*[@id=\"message-text\"]"));
    private final SelenideElement sendButton = $(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));
    private final SelenideElement closeXButton = $(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));

    //Методы:

    public void typeEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void typeName(String name) {
        nameInput.sendKeys(name);
    }

    public void typeMessage(String message) {
        messageInput.sendKeys(message);
    }

    public void clickSend() {
        sendButton.click();
    }

    public void acceptAlert() {
        switchTo().alert().accept();
    }

    public void clickCloseX() {
        closeXButton.click();
    }
}
