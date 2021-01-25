package HospitalTests;

import HospitalPages.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AppConfig;

public class Logout extends BaseTest {
    @Test
    public void logOut() {
        LoginPage loginpage = new LoginPage(driver);
        String validUsername = AppConfig.USERNAME;
        String validPassword = AppConfig.PASSWORD;
        loginpage.login(validUsername, validPassword);
        loginpage.logout();
        wait.until(ExpectedConditions.urlContains("#/login"));
    }
}
