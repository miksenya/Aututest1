package com.demoblaze;

import com.demoblaze.config.BaseTestConfig1;
import org.junit.jupiter.api.Test;
import pagedemoblaze.CartPage;
import pagedemoblaze.HomePage;
import pagedemoblaze.OrderModalPage;
import pagedemoblaze.ProductPage;

public class CheckoutPurchaseTest extends BaseTestConfig1 {

    @Test
    void buyPhoneWithPlaceOrder() {
        HomePage home = new HomePage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();
        OrderModalPage order = new OrderModalPage();


        home.clickPhonesCategory();
        home.openSamsungPhone();
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
        order.clickOrderAccept();
    }
}
