package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest implements ITestConstants {

    String EMPTY_USERNAME_ERROR_MESSAGE = "Epic sadface: Username is required";
    String EMPTY_PASSWORD_ERROR_MESSAGE = "Epic sadface: Password is required";

    /**
     * Login with empty name field test.
     * Check that when login with empty username field error message is displayed
     */
    @Test
    public void loginWithEmptyNameFieldTest() {
        loginPage
                .openPage()
                .login(EMPTY_STRING, STANDARD_PASSWORD);
        Assert.assertEquals(loginPage.getErrorMessage(), EMPTY_USERNAME_ERROR_MESSAGE);
    }

    /**
     * Login with empty password field test.
     * Check that when login with empty password field error message is displayed
     */
    @Test
    public void loginWithEmptyPasswordFieldTest() {
        loginPage
                .openPage()
                .login(STANDARD_USER_LOGIN, EMPTY_STRING);
        Assert.assertEquals(loginPage.getErrorMessage(), EMPTY_PASSWORD_ERROR_MESSAGE);
    }

    /**
     * Login with empty login and password fields test.
     * Check that when login with empty username and password fields error message is displayed
     */
    @Test
    public void loginWithEmptyLoginAndPasswordFieldsTest() {
        loginPage
                .openPage()
                .login(EMPTY_STRING, EMPTY_STRING);
        Assert.assertEquals(loginPage.getErrorMessage(), EMPTY_USERNAME_ERROR_MESSAGE);
    }
}