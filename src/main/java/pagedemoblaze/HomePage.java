package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement categoryLink = $(By.xpath("//*[@id=\"itemc\"]"));
    private final SelenideElement firstProductLink = $(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
    private final SelenideElement cartLink = $(By.xpath("//*[@id=\"cartur\"]"));
    private final SelenideElement homeLogo = $(By.xpath("//*[@id=\"nava\"]"));

    private final SelenideElement phonesCategoryLink = $(By.xpath("//*[@id=\"itemc\"]"));
    private final SelenideElement firstSamsungLink = $(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));

    private final SelenideElement carouselRightButton = $(By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[2]/span[1]"));
    private final SelenideElement NextButton = $(By.xpath("//*[@id=\"next2\"]"));
    private final SelenideElement macBookProLink = $(By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a"));
    private final SelenideElement homeLogoLink = $(By.xpath("//*[@id=\"nava\"]"));
    private final SelenideElement sonyVaioLink = $(By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a"));
    private final SelenideElement homeMenuLink = $(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    private final SelenideElement dell2017Link = $(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));


    //Методы:
    public void clickCategory() {
        categoryLink.click();
    }

    public void openFirstProduct() {
        firstProductLink.click();
    }

    public void openCart() {
        cartLink.click();
    }

    public void goHome() {
        homeLogo.click();
    }

    public void clickPhonesCategory() {
        phonesCategoryLink.click();
    }

    public void openSamsungPhone() {
        firstSamsungLink.click();
    }

    public void clickCarouselRight() {
        carouselRightButton.click();
    }

    public void clickNextButton() {
        NextButton.click();
    }

    public void openMacBookPro() {
        macBookProLink.click();
    }

    public void clickHomeLogo() {
        homeLogoLink.click();
    }

    public void openSonyVaioNotebook() {
        sonyVaioLink.click();
    }

    public void clickHomeMenu() {
        homeMenuLink.click();
    }

    public void openDell2017() {
        dell2017Link.click();
    }
}
