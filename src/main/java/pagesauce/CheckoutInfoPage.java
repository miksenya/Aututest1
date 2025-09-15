package pagesauce;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutInfoPage {

    private final SelenideElement firstNameInput = $(By.xpath("//*[@id=\"first-name\"]"));
    private final SelenideElement lastNameInput = $(By.xpath("//*[@id=\"last-name\"]"));
    private final SelenideElement indexInput = $(By.xpath("//*[@id=\"postal-code\"]"));
    private final SelenideElement continueButton = $(By.xpath("//*[@id=\"continue\"]"));

    public void typeFirstName(String firstname){
        firstNameInput.sendKeys(firstname);
    }
    public void typeLastName(String lastname){
        lastNameInput.sendKeys(lastname);
    }
    public void typeIndex(String index){
        indexInput.sendKeys(index);
    }
    public void clickContinue(){
        continueButton.click();
    }
}
