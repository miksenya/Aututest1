package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderModalPage {
    private final SelenideElement nameInput = $(By.xpath("//*[@id=\"name\"]"));
    private final SelenideElement countryInput = $(By.xpath("//*[@id=\"country\"]"));
    private final SelenideElement cityInput = $(By.xpath("//*[@id=\"city\"]"));
    private final SelenideElement cardNumberInput = $(By.xpath("//*[@id=\"card\"]"));
    private final SelenideElement monthInput = $(By.xpath("//*[@id=\"month\"]"));
    private final SelenideElement yearInput = $(By.xpath("//*[@id=\"year\"]"));
    private final SelenideElement purchaseButton = $(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    private final SelenideElement orderAcceptOk = $(By.xpath("/html/body/div[10]/div[7]/div/button"));


    public void typeName(String name) {
        nameInput.sendKeys(name);
    }

    public void typeCountry(String country) {
        countryInput.sendKeys(country);
    }

    public void typeCity(String city) {
        cityInput.sendKeys(city);
    }

    public void typeCardNumber(String cardnumber) {
        cardNumberInput.sendKeys(cardnumber);
    }

    public void typeMonth(String month) {
        monthInput.sendKeys(month);
    }

    public void typeYear(String year) {
        yearInput.sendKeys(year);
    }

    public void clickPurchase() {
        purchaseButton.click();
    }

    public void clickOrderAccept() {
        orderAcceptOk.click();
    }
}
