package HospitalTests;
import HospitalPages.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AppConfig;

public class InvalidLogin extends BaseTest {
    @Test
    public void invalidLogin () {
        LoginPage loginPage = new LoginPage(driver);
        String invalidUsername = AppConfig.INVALIDUSERNAME;
        String invalidPassword = AppConfig.INVALIDPASSWORD;
        loginPage.login(invalidUsername, invalidPassword);
        final String error = loginPage.getErrorMessage();
        Assert.assertEquals(error, "Username or password is incorrect.");
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }
}
