package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    public static final String EMPTY_USERNAME_ERROR_MESSAGE = "Epic sadface: Username is required";
    public static final String EMPTY_PASSWORD_ERROR_MESSAGE = "Epic sadface: Password is required";

    @Test
    public void loginWithEmptyNameFieldTest() {
        loginPage.openPage();
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(), EMPTY_USERNAME_ERROR_MESSAGE);
    }

    @Test
    public void loginWithEmptyPasswordFieldTest() {
        loginPage.openPage();
        loginPage.login("standard_user", "");
        Assert.assertEquals(loginPage.getErrorMessage(), EMPTY_PASSWORD_ERROR_MESSAGE);
    }

    @Test
    public void loginWithEmptyLoginAndPasswordFieldsTest() {
        loginPage.openPage();
        loginPage.login("", "");
        Assert.assertEquals(loginPage.getErrorMessage(), EMPTY_USERNAME_ERROR_MESSAGE);
    }
}