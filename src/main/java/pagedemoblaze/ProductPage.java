package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class ProductPage {

    //Параметры:
    private final SelenideElement addToCartButton = $(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

    //Методы:
    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void acceptAddToCartAlert() {
        switchTo().alert().accept();
    }
}
