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
        Assert.assertEquals(loginSteps.loginWithErrorMessage(EMPTY_STRING, STANDARD_PASSWORD), EMPTY_USERNAME_ERROR_MESSAGE);
    }

    /**
     * Login with empty password field test.
     * Check that when login with empty password field error message is displayed
     */
    @Test
    public void loginWithEmptyPasswordFieldTest() {
        Assert.assertEquals(loginSteps.loginWithErrorMessage(STANDARD_USER_LOGIN, EMPTY_STRING), EMPTY_PASSWORD_ERROR_MESSAGE);
    }

    /**
     * Login with empty login and password fields test.
     * Check that when login with empty username and password fields error message is displayed
     */
    @Test
    public void loginWithEmptyLoginAndPasswordFieldsTest() {
        Assert.assertEquals(loginSteps.loginWithErrorMessage(EMPTY_STRING, EMPTY_STRING), EMPTY_USERNAME_ERROR_MESSAGE);
    }
}