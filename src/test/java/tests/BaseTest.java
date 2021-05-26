package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    ProductsPage productsPage;
    CartPage cartPage;
    LoginPage loginPage;

    /**
     * Init test.
     * This method performed before the test method
     */
    @BeforeMethod
    public void InitTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        initPages();
    }

    /**
     * End test.
     * This method performed after test method regardless of the test result
     */
    @AfterMethod(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }

    /**
     * Init pages.
     */
    public void initPages() {
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        loginPage = new LoginPage(driver);
    }
}