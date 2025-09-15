package pagesauce;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    private final SelenideElement backpackButton = $(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    private final SelenideElement bikeLightButton = $(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
    private final SelenideElement fleeceJacketButton = $(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
    private final SelenideElement cartLink = $(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

    public void addBackpack(){
        backpackButton.click();
    }
    public void addBikeLight(){
        bikeLightButton.click();
    }
    public void addFleeceJacket(){
        fleeceJacketButton.click();
    }
    public void openCart(){
        cartLink.click();
    }

}
