package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {
    //Параметры:

    private final SelenideElement contactLink = $(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
    private final SelenideElement aboutUsLink = $(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));

    //Параметры:

    public void clickContact() {
        contactLink.click();
    }

    public void clickAboutUs() {
        aboutUsLink.click();
    }

}
