package pagedemoblaze;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AboutUsModalPage {

    private final SelenideElement closeXButton = $(By.xpath("//*[@id=\"videoModal\"]/div/div/div[1]/button/span"));

    public void clickCloseX() {
        closeXButton.click();
    }
}
