package pagesauce;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage {

    private final SelenideElement finishButton = $(By.xpath("//*[@id=\"finish\"]"));

    public void clickFinish(){
        finishButton.click();
    }

}
