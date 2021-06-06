package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends HeaderPage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public static final String ADD_AND_REMOVE_PRODUCT_TO_CART_BUTTON = "//*[text()='%s']/ancestor::*[@class='inventory_item']//button";
    public static final String PRODUCT_ITEM = "//*[text()='%s']/ancestor::*[@class='cart_item']";
    public static final String PRODUCT_PRICE = PRODUCT_ITEM + "//*[@class='inventory_item_price']";

    /**
     * Open page products page.
     *
     * @return the products page
     */
    @Step("Open Products page")
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
    @Step("Add product {productName} to cart")
    public ProductsPage addProductToCart(String productName) {
        String addAndRemoveProductToCartButtonElement = String.format(ADD_AND_REMOVE_PRODUCT_TO_CART_BUTTON, productName);
        waitForElementLocated(By.xpath(addAndRemoveProductToCartButtonElement), 10);
        driver.findElement(By.xpath(addAndRemoveProductToCartButtonElement)).click();
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
        String productPriceElement = String.format(PRODUCT_PRICE, productName);
        waitForElementLocated(By.xpath(productPriceElement), 10);
        return driver.findElement(By.xpath(productPriceElement)).getText();
    }
}