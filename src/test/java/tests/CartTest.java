package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest implements ITestConstants {

    /**
     * Check products price in cart test.
     * This method checks that the price of the product in the cart and on the products page matches
     */
    @Test
    public void checkProductsPriceInCartTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, STANDARD_PASSWORD)
                .addProductToCart(SAUCE_LABS_BACKPACK_PRODUCT);
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductPrice(SAUCE_LABS_BACKPACK_PRODUCT), productsPage.getProductPrice(SAUCE_LABS_BACKPACK_PRODUCT));
    }

    /**
     * Check quantity field test.
     * This method checks quantity added product in the cart
     */
    @Test
    public void checkQuantityFieldTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, STANDARD_PASSWORD)
                .addProductToCart(SAUCE_LABS_BACKPACK_PRODUCT);
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductQuantity(SAUCE_LABS_BACKPACK_PRODUCT), "1");
    }

    /**
     * Check remove button is displayed.
     * This method checks when add product to cart remove button is displayed in cart
     */
    @Test
    public void checkRemoveButtonIsDisplayedTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, STANDARD_PASSWORD)
                .addProductToCart(SAUCE_LABS_BACKPACK_PRODUCT);
        cartPage.openPage();
        Assert.assertTrue(cartPage.isRemoveButtonDisplayed(SAUCE_LABS_BACKPACK_PRODUCT));
    }
}