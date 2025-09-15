package com.demoblaze;

import com.demoblaze.config.BaseTestConfig1;
import org.junit.jupiter.api.Test;
import pagedemoblaze.CartPage;
import pagedemoblaze.HomePage;
import pagedemoblaze.OrderModalPage;
import pagedemoblaze.ProductPage;

import static com.codeborne.selenide.Selenide.sleep;


public class MultiAddToCartCheckout extends BaseTestConfig1 {

    @Test
    void addSeveralLaptopsAndCheckout() {
        HomePage home = new HomePage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();
        OrderModalPage order = new OrderModalPage();

        home.clickCarouselRight();
        home.clickCarouselRight();
        home.clickNextButton();

        home.openMacBookPro();
        product.clickAddToCart();
        product.acceptAddToCartAlert();

        home.clickHomeLogo();

        home.openSonyVaioNotebook();
        product.clickAddToCart();
        product.acceptAddToCartAlert();

        home.clickHomeMenu();
        home.clickNextButton();

        home.openDell2017();
        product.clickAddToCart();
        product.acceptAddToCartAlert();

        home.openCart();
        cart.clickPlaceOrder();

        order.typeName("Arseniy");
        order.typeCountry("Russia");
        order.typeCity("Ekb");
        order.typeCardNumber("4204567898764032");
        order.typeMonth("August");
        order.typeYear("2025");
        order.clickPurchase();

        sleep(2000);
        order.clickOrderAccept();
    }
}
