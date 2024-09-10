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
    @Test(description = "Check that when add product to cart remove button for this product is displayed")
    public void removeButtonIsDisplayedTest() {
        productSteps.loginAndAddProductToCart(System.getenv().getOrDefault(USER_NAME, PropertyReader.getProperty(USER_NAME)),
                System.getenv().getOrDefault(PASSWORD, PropertyReader.getProperty(PASSWORD)), SAUCE_LABS_BACKPACK_PRODUCT);
        Assert.assertTrue(productSteps.getButtonText(SAUCE_LABS_BACKPACK_PRODUCT).equalsIgnoreCase(EXPECTED_REMOVE_BUTTON_NAME));
    }

    /**
     * Cart button is displayed test.
     * Check that cart button is displayed on products page
     */
    @Test(description = "Check that cart button is displayed on products page")
    public void cartButtonIsDisplayedTest() {
        loginSteps.login(System.getenv().getOrDefault(USER_NAME, PropertyReader.getProperty(USER_NAME)),
                System.getenv().getOrDefault(PASSWORD, PropertyReader.getProperty(PASSWORD)));
        Assert.assertTrue(productSteps.isCartButtonDisplayed());
    }

    /**
     * Amount of products in cart is displayed on cart sign test.
     * Check that when add product to cart amount of products in cart is displayed on cart sign on products page
     */
    @Test(description = "Check that when add product to cart amount of products in cart is displayed on cart sign on products page")
    public void amountOfProductsInCartIsDisplayedOnCartSignTest() {
        productSteps.loginAndAddTwoProductsToCart(System.getenv().getOrDefault(USER_NAME, PropertyReader.getProperty(USER_NAME)),
                System.getenv().getOrDefault(PASSWORD, PropertyReader.getProperty(PASSWORD)), SAUCE_LABS_BACKPACK_PRODUCT, SAUCE_LABS_BOLT_T_SHIRT);
        Assert.assertEquals(productSteps.getAmountOfProductsInCart(), "2");
    }
}