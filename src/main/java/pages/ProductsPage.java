package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends HeaderPage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page products page.
     *
     * @return the products page
     */
    public ProductsPage openPage() {
        super.openPage(SAUCE_DEMO_PRODUCTS_PAGE_URL);
        return this;
    }

    /**
     * Add product to cart of products page.
     *
     * @param productName the product name
     * @return the products page
     */
    public ProductsPage addProductToCart(String productName) {
        waitForElementLocated(By.xpath(String.format(ADD_AND_REMOVE_PRODUCT_TO_CART_BUTTON, productName)), 10);
        driver.findElement(By.xpath(String.format(ADD_AND_REMOVE_PRODUCT_TO_CART_BUTTON, productName))).click();
        return this;
    }

    /**
     * Gets add and remove product to cart button text.
     *
     * @param productName the product name
     * @return the add and remove product to cart button text
     */
    public String getAddAndRemoveProductToCartButtonText(String productName) {
        return driver.findElement(By.xpath(String.format(ADD_AND_REMOVE_PRODUCT_TO_CART_BUTTON, productName))).getText();
    }

    /**
     * Gets product price.
     *
     * @param productName the product name
     * @return the product price
     */
    public String getProductPrice(String productName) {
        waitForElementLocated(By.xpath(String.format(PRODUCT_PRICE, productName)), 10);
        return driver.findElement(By.xpath(String.format(PRODUCT_PRICE, productName))).getText();
    }
}