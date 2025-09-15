package pagesauce;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CheckoutCompletePage {

    private final SelenideElement backHomeButton = $(By.xpath("//*[@id=\"back-to-products\"]"));

    public void clickBackHome(){
        backHomeButton.click();
    }

}
