package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    //Параметры:
    private final SelenideElement deleteFirstItemLink = $(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a"));
    private final SelenideElement placeOrderButton = $(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));

    //Методы:
    public void clickDeleteFirstItem() {
        deleteFirstItemLink.click();
    }

    public void clickPlaceOrder() {
        placeOrderButton.click();
    }
}
