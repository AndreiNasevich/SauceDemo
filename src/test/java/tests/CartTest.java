package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class CartTest extends BaseTest implements ITestConstants {

    /**
     * Check products price in cart test.
     * This method check that the price of the product in the cart and on the products page matches
     */
    @Test(retryAnalyzer = Retry.class, description = "Check that the price of the product in the cart and on the products page matches")
    public void checkProductsPriceInCartTest() {
        productSteps.loginAndAddProductToCart(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                System.getenv().getOrDefault("password", PropertyReader.getProperty("password")), SAUCE_LABS_BACKPACK_PRODUCT);
        cartSteps.openCartPage();
        Assert.assertEquals(cartSteps.getPrice(SAUCE_LABS_BACKPACK_PRODUCT), productSteps.getPrice(SAUCE_LABS_BACKPACK_PRODUCT));
    }

    /**
     * Check quantity field test.
     * This method check quantity added product in the cart
     */
    @Test(description = "Check quantity added product in the cart")
    public void checkQuantityFieldTest() {
        productSteps.loginAndAddProductToCart(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                System.getenv().getOrDefault("password", PropertyReader.getProperty("password")), SAUCE_LABS_BACKPACK_PRODUCT);
        cartSteps.openCartPage();
        Assert.assertEquals(cartSteps.getQuantity(SAUCE_LABS_BACKPACK_PRODUCT), "1");
    }

    /**
     * Check remove button is displayed.
     * This method check when add product to cart remove button is displayed in cart
     */
    @Test(description = "Check when add product to cart remove button is displayed in cart")
    public void checkRemoveButtonIsDisplayedTest() {
        productSteps.loginAndAddProductToCart(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                System.getenv().getOrDefault("password", PropertyReader.getProperty("password")), SAUCE_LABS_BACKPACK_PRODUCT);
        cartSteps.openCartPage();
        Assert.assertTrue(cartSteps.isRemoveButtonDisplayed(SAUCE_LABS_BACKPACK_PRODUCT));
    }
}