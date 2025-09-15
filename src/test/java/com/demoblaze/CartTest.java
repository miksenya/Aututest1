package com.demoblaze;


import com.demoblaze.config.BaseTestConfig1;
import org.junit.jupiter.api.Test;
import pagedemoblaze.CartPage;
import pagedemoblaze.HomePage;
import pagedemoblaze.ProductPage;

import static com.codeborne.selenide.Selenide.*;

public class CartTest extends BaseTestConfig1 {

    @Test
    void addToCartDeleteAndBackHome() {
        HomePage home = new HomePage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        home.clickCategory();
        home.openFirstProduct();
        product.clickAddToCart();
        product.acceptAddToCartAlert();
        home.openCart();
        cart.clickDeleteFirstItem();
        home.goHome();
        sleep(3000);
    }
}
