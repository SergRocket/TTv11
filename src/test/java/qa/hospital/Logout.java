package qa.hospital;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.hospital.pages.LoginPage;
import qa.hospital.pages.MainPage;
import qa.hospital.utils.AppConfig;

public class Logout extends BaseTest {
    @Test
    public void logOut () {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginpage = new LoginPage(driver);
        String validusername = AppConfig.USERNAME;
        String validpassword = AppConfig.PASSWORD;
        loginpage.login(validusername, validpassword);
        wait.until(ExpectedConditions.visibilityOfAllElements(mainPage.cogWheel()));
        mainPage.cogWheel().click();
        mainPage.logOut().click();
        wait.until(ExpectedConditions.urlContains("#/login"));
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }

    /*public static void main (String[]args) throws InterruptedException {
        Logout LO = new Logout();
        LO.BeforeLogin();
        LO.ValidLog();
        LO.LogOut();
        LO.ShuttingDown();
    }*/
}
