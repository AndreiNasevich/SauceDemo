package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest implements ITestConstants {

    /**
     * Remove button is displayed test.
     * Check that when add product to cart remove button for this product is displayed
     */
    @Test
    public void removeButtonIsDisplayedTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, STANDARD_PASSWORD)
                .addProductToCart(SAUCE_LABS_BACKPACK_PRODUCT);
        Assert.assertEquals(productsPage.getAddAndRemoveProductToCartButtonText(SAUCE_LABS_BACKPACK_PRODUCT), "REMOVE");
    }

    /**
     * Cart button is displayed test.
     * Check that cart button is displayed on products page
     */
    @Test
    public void cartButtonIsDisplayedTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, STANDARD_PASSWORD);
        Assert.assertTrue(productsPage.isCartButtonDisplayed());
    }

    /**
     * Amount of products in cart is displayed on cart sign test.
     * Check that when add product to cart amount of products in cart is displayed on cart sign on products page
     */
    @Test
    public void amountOfProductsInCartIsDisplayedOnCartSignTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, STANDARD_PASSWORD)
                .addProductToCart(SAUCE_LABS_BACKPACK_PRODUCT)
                .addProductToCart(SAUCE_LABS_BOLT_T_SHIRT);
        Assert.assertEquals(productsPage.getAmountOfProductsInCartOnCartButtonSign(), "2");
    }
}