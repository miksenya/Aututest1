package com.demoblaze;

import com.demoblaze.config.BaseTestConfig1;
import org.junit.jupiter.api.Test;
import pagedemoblaze.AboutUsModalPage;
import pagedemoblaze.ContactModalPage;
import pagedemoblaze.HeaderPage;

import static com.codeborne.selenide.Selenide.sleep;

public class ContactAboutUsTest extends BaseTestConfig1 {

    @Test
    void testContactAndAboutUs() {
        HeaderPage header = new HeaderPage();
        ContactModalPage contact = new ContactModalPage();
        AboutUsModalPage about = new AboutUsModalPage();

        header.clickContact();
        contact.typeEmail("pe4alka@e1.ru");
        contact.typeName("Aseniy");
        contact.typeMessage("Hello dear community, i'm fuck this day");
        contact.clickSend();
        sleep(2000);
        contact.acceptAlert();
        sleep(2000);
        contact.clickCloseX();
        header.clickAboutUs();
        about.clickCloseX();
    }
}
