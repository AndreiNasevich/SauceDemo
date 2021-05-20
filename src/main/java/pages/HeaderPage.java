package pages;

import constans.IProductsConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage implements IProductsConstants {

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement goToCartButton;

    @FindBy(xpath = "//*[@class='shopping_cart_badge']")
    WebElement amountOfProductsInCartOnCartSign;

    /**
     * Is cart button displayed boolean.
     *
     * @return the boolean
     */
    public boolean isCartButtonDisplayed() {
        waitForElementLocated(goToCartButton, 10);
        return goToCartButton.isDisplayed();
    }

    /**
     * Gets amount of products in cart on cart button sign.
     *
     * @return the amount of products in cart on cart button sign
     */
    public String getAmountOfProductsInCartOnCartButtonSign() {
        return amountOfProductsInCartOnCartSign.getText();
    }
}