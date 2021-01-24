package qa.hospital;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.hospital.pages.LoginPage;
import qa.hospital.utils.AppConfig;

public class InvalidLogin extends BaseTest {
    @Test
    public void invalidLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(AppConfig.INVALIDUSERNAME, AppConfig.INVALIDPASSWORD);
        final String error = loginPage.getErrorMessage();

        Assert.assertEquals(error, "Username or password is incorrect.");
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }
}
