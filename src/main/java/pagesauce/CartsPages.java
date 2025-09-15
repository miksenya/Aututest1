package pagesauce;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartsPages {

    private final SelenideElement checkoutButton = $(By.xpath("//*[@id=\"checkout\"]"));

    public void clickCheckout(){
        checkoutButton.click();
    }

}
