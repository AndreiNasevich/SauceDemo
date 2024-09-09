package tests;

import constants.ITestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class LoginTest extends BaseTest implements ITestConstants {

    String EMPTY_USERNAME_ERROR_MESSAGE = "Epic sadface: Username is required";
    String EMPTY_PASSWORD_ERROR_MESSAGE = "Epic sadface: Password is required";

    /**
     * Login with empty name field test.
     * Check that when login with empty username field error message is displayed
     */
    @Test(description = "Check that when login with empty username field error message is displayed")
    public void loginWithEmptyNameFieldTest() {
        Assert.assertEquals(loginSteps.loginWithErrorMessage(EMPTY_STRING, System.getenv().getOrDefault("password",
                PropertyReader.getProperty("password"))), EMPTY_USERNAME_ERROR_MESSAGE);
    }

    /**
     * Login with empty password field test.
     * Check that when login with empty password field error message is displayed
     */
    @Test(description = "Check that when login with empty password field error message is displayed")
    public void loginWithEmptyPasswordFieldTest() {
        Assert.assertEquals(loginSteps.loginWithErrorMessage(System.getenv().getOrDefault(USER_NAME, PropertyReader.getProperty(USER_NAME)),
                EMPTY_STRING), EMPTY_PASSWORD_ERROR_MESSAGE);
    }

    /**
     * Login with empty login and password fields test.
     * Check that when login with empty username and password fields error message is displayed
     */
    @Test(description = "Check that when login with empty username and password fields error message is displayed")
    public void loginWithEmptyLoginAndPasswordFieldsTest() {
        Assert.assertEquals(loginSteps.loginWithErrorMessage(EMPTY_STRING, EMPTY_STRING), EMPTY_USERNAME_ERROR_MESSAGE);
    }
}