package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductSteps {

    private final LoginPage loginPage;
    private final ProductsPage productsPage;

    public ProductSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    /**
     * Login and add product to cart product steps.
     *
     * @param userName    the user name
     * @param password    the password
     * @param productName the product name
     * @return the product steps
     */
    @Step("Login and add product to cart")
    public ProductSteps loginAndAddProductToCart(String userName, String password, String productName) {
        loginPage
                .openPage()
                .login(userName, password)
                .addProductToCart(productName);
        return this;
    }

    /**
     * Login and add two products to cart product steps.
     *
     * @param userName          the user name
     * @param password          the password
     * @param firstProductName  the first product name
     * @param secondProductName the second product name
     * @return the product steps
     */
    @Step("Login and add two products to cart")
    public ProductSteps loginAndAddTwoProductsToCart(String userName, String password, String firstProductName, String secondProductName) {
        loginPage
                .openPage()
                .login(userName, password)
                .addProductToCart(firstProductName)
                .addProductToCart(secondProductName);
        return this;
    }

    /**
     * Gets price.
     *
     * @param productName the product name
     * @return the price
     */
    @Step("Get price for product: {productName} at products page")
    public String getPrice(String productName) {
        return productsPage.getProductPrice(productName);
    }

    /**
     * Gets button text.
     *
     * @param productName the product name
     * @return the button text
     */
    @Step("Get button name for product: {productName}")
    public String getButtonText(String productName) {
        return productsPage.getAddAndRemoveProductToCartButtonText(productName);
    }

    /**
     * Is cart button displayed boolean.
     *
     * @return the boolean
     */
    @Step("Chek cart button is displayed")
    public boolean isCartButtonDisplayed() {
        return productsPage.isCartButtonDisplayed();
    }

    /**
     * Gets amount of products in cart.
     *
     * @return the amount of products in cart
     */
    @Step("Get amount of products in cart")
    public String getAmountOfProductsInCart() {
        return productsPage.getAmountOfProductsInCartText();
    }
}