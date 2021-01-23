package HospitalTests;

import HospitalPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {
    @Test
    public void invalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        String invalidUsername = TestData.INVALIDUSERNAME.getTestData();
        String invalidPassword = TestData.INVALIDPASSWORD.getTestData();

        loginPage.login(invalidUsername, invalidPassword);
        String error = loginPage.getErrorMessage();

        Assert.assertEquals(error, "Username or password is incorrect.");
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }
}
