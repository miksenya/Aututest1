package com.saucedemo;

import com.saucedemo.config.BaseTestConfig2;
import org.junit.jupiter.api.Test;
import pagesauce.*;

public class SwagLabs extends BaseTestConfig2 {

        @Test
        public void Swag(){
            LoginPage login = new LoginPage();
            InventoryPage inventory = new InventoryPage();
            CartsPages carts = new CartsPages();
            CheckoutInfoPage info = new CheckoutInfoPage();
            CheckoutOverviewPage overview = new CheckoutOverviewPage();
            CheckoutCompletePage complete = new CheckoutCompletePage();

        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();

        inventory.addBackpack();
        inventory.addBikeLight();
        inventory.addFleeceJacket();
        inventory.openCart();

        carts.clickCheckout();


        info.typeFirstName("Arseniy");
        info.typeLastName("Mikhailov");
        info.typeIndex("234567");
        info.clickContinue();

        overview.clickFinish();
        complete.clickBackHome();
        }
    }