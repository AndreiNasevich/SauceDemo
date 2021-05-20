package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends HeaderPage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page cart page.
     *
     * @return the cart page
     */
    public CartPage openPage() {
        super.openPage(SAUCE_DEMO_CART_PAGE_URL);
        return this;
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

    /**
     * Gets product quantity.
     *
     * @param productName the product name
     * @return the product quantity
     */
    public String getProductQuantity(String productName) {
        waitForElementLocated(By.xpath(String.format(PRODUCT_QUANTITY, productName)), 10);
        return driver.findElement(By.xpath(String.format(PRODUCT_QUANTITY, productName))).getText();
    }

    /**
     * Is remove button displayed boolean.
     *
     * @param productName the product name
     * @return the boolean
     */
    public boolean isRemoveButtonDisplayed(String productName) {
        return driver.findElement(By.xpath(String.format(REMOVE_PRODUCT_FROM_CART_BUTTON, productName))).isDisplayed();
    }
}