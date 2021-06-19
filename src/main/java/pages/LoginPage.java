package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-test='username']")
    WebElement usernameInput;

    @FindBy(xpath = "//*[@data-test='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//*[@data-test='error']")
    WebElement errorMessage;

    /**
     * Open page login page.
     *
     * @return the login page
     */
    @Step("Open Login page")
    public LoginPage openPage() {
        log.info("Open Login page URL " + SAUCE_DEMO_BASE_URL);
        super.openPage(SAUCE_DEMO_BASE_URL);
        return this;
    }

    /**
     * Login and go to products page.
     *
     * @param username the username
     * @param password the password
     * @return the products page
     */
    @Step("Fill in {username} and {password} in login fields and click login button")
    public ProductsPage login(String username, String password) {
        waitForElementLocated(usernameInput, 10);
        log.info(String.format("Fill in username: '%s' in Login field.", username));
        usernameInput.sendKeys(username);
        log.info(String.format("Fill in password: '%s' in Login field.", password));
        passwordInput.sendKeys(password);
        log.info("Click Login button.");
        loginButton.click();
        return new ProductsPage(driver);
    }

    /**
     * Gets error message.
     *
     * @return the error message
     */
    @Step("Get error message text")
    public String getErrorMessage() {
        waitForElementLocated(errorMessage, 10);
        log.info("Get error message.");
        return errorMessage.getText();
    }
}