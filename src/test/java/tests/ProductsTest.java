package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void removeButtonIsDisplayedTest() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Backpack");
        Assert.assertEquals(productsPage.getAddAndRemoveProductToCartButtonText("Sauce Labs Backpack"),
                "REMOVE");
    }
}
