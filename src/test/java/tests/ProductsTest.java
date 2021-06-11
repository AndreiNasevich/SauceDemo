package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class ProductsTest extends BaseTest implements ITestConstants {

    /**
     * Remove button is displayed test.
     * Check that when add product to cart remove button for this product is displayed
     */
    @Test
    public void removeButtonIsDisplayedTest() {
        productSteps.loginAndAddProductToCart(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                System.getenv().getOrDefault("password", PropertyReader.getProperty("password")), SAUCE_LABS_BACKPACK_PRODUCT);
        Assert.assertEquals(productSteps.getButtonText(SAUCE_LABS_BACKPACK_PRODUCT), EXPECTED_REMOVE_BUTTON_NAME);
    }

    /**
     * Cart button is displayed test.
     * Check that cart button is displayed on products page
     */
    @Test
    public void cartButtonIsDisplayedTest() {
        loginSteps.login(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                System.getenv().getOrDefault("password", PropertyReader.getProperty("password")));
        Assert.assertTrue(productSteps.isCartButtonDisplayed());
    }

    /**
     * Amount of products in cart is displayed on cart sign test.
     * Check that when add product to cart amount of products in cart is displayed on cart sign on products page
     */
    @Test
    public void amountOfProductsInCartIsDisplayedOnCartSignTest() {
        productSteps.loginAndAddTwoProductsToCart(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                System.getenv().getOrDefault("password", PropertyReader.getProperty("password")), SAUCE_LABS_BACKPACK_PRODUCT, SAUCE_LABS_BOLT_T_SHIRT);
        Assert.assertEquals(productSteps.getAmountOfProductsInCart(), "2");
    }
}