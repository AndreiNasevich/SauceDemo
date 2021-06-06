package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    /**
     * Login with error message string.
     *
     * @param userName the user name
     * @param password the password
     * @return the string
     */
    @Step("Try login with incorrect data")
    public String loginWithErrorMessage(String userName, String password) {
        loginPage
                .openPage()
                .login(userName, password);
        return loginPage.getErrorMessage();
    }

    /**
     * Login login steps.
     *
     * @param userName the user name
     * @param password the password
     * @return the login steps
     */
    @Step("Login")
    public LoginSteps login(String userName, String password) {
        loginPage
                .openPage()
                .login(userName, password);
        return this;
    }
}