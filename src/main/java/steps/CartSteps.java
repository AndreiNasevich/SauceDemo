package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class CartSteps {

    private final CartPage cartPage;

    public CartSteps(WebDriver driver) {
        cartPage = new CartPage(driver);
    }

    /**
     * Open cart page cart steps.
     *
     * @return the cart steps
     */
    @Step("Open Cart page")
    public CartSteps openCartPage() {
        cartPage.openPage();
        return this;
    }

    /**
     * Gets price.
     *
     * @param productName the product name
     * @return the price
     */
    @Step("Get price for product: {productName} at cart page")
    public String getPrice(String productName) {
        return cartPage.getProductPrice(productName);
    }

    /**
     * Gets quantity.
     *
     * @param productName the product name
     * @return the quantity
     */
    @Step("Get quantity for product: {productName}")
    public String getQuantity(String productName) {
        return cartPage.getProductQuantity(productName);
    }

    /**
     * Is remove button displayed boolean.
     *
     * @param productName the product name
     * @return the boolean
     */
    @Step("Chek remove button is displayed")
    public boolean isRemoveButtonDisplayed(String productName) {
        return cartPage.isRemoveButtonDisplayed(productName);
    }
}