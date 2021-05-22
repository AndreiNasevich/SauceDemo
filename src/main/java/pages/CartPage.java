package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends HeaderPage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public static final String PRODUCT_ITEM = "//*[text()='%s']/ancestor::*[@class='cart_item']";
    public static final String PRODUCT_PRICE = PRODUCT_ITEM + "//*[@class='inventory_item_price']";
    public static final String PRODUCT_QUANTITY = PRODUCT_ITEM + "//*[@class='cart_quantity']";
    public static final String REMOVE_PRODUCT_FROM_CART_BUTTON = "//*[text()='%s']/ancestor::*[@class='cart_item_label']//button";

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
        String productPriceElement = String.format(PRODUCT_PRICE, productName);
        waitForElementLocated((By.xpath(productPriceElement)), 10);
        return driver.findElement(By.xpath(productPriceElement)).getText();
    }

    /**
     * Gets product quantity.
     *
     * @param productName the product name
     * @return the product quantity
     */
    public String getProductQuantity(String productName) {
        String productQuantityElement = String.format(PRODUCT_QUANTITY, productName);
        waitForElementLocated(By.xpath(productQuantityElement), 10);
        return driver.findElement(By.xpath(productQuantityElement)).getText();
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