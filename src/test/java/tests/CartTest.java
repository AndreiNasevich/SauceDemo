package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest implements ITestConstants {

    /**
     * Check products price in cart test.
     * This method checks that the price of the product in the cart and on the products page matches
     */
    @Test(retryAnalyzer = Retry.class)
    public void checkProductsPriceInCartTest() {
        productSteps.loginAndAddProductToCart(STANDARD_USER_LOGIN, STANDARD_PASSWORD, SAUCE_LABS_BACKPACK_PRODUCT);
        cartSteps.openCartPage();
        Assert.assertEquals(cartSteps.getPrice(SAUCE_LABS_BACKPACK_PRODUCT), productSteps.getPrice(SAUCE_LABS_BACKPACK_PRODUCT));
    }

    /**
     * Check quantity field test.
     * This method checks quantity added product in the cart
     */
    @Test
    public void checkQuantityFieldTest() {
        productSteps.loginAndAddProductToCart(STANDARD_USER_LOGIN, STANDARD_PASSWORD, SAUCE_LABS_BACKPACK_PRODUCT);
        cartSteps.openCartPage();
        Assert.assertEquals(cartSteps.getQuantity(SAUCE_LABS_BACKPACK_PRODUCT), "1");
    }

    /**
     * Check remove button is displayed.
     * This method checks when add product to cart remove button is displayed in cart
     */
    @Test
    public void checkRemoveButtonIsDisplayedTest() {
        productSteps.loginAndAddProductToCart(STANDARD_USER_LOGIN, STANDARD_PASSWORD, SAUCE_LABS_BACKPACK_PRODUCT);
        cartSteps.openCartPage();
        Assert.assertTrue(cartSteps.isRemoveButtonDisplayed(SAUCE_LABS_BACKPACK_PRODUCT));
    }
}