package HospitalTests;

import HospitalPages.LoginPage;
import HospitalPages.MainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends BaseTest {
    @Test
    public void logOut () {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginpage = new LoginPage(driver);
        String validusername = TestData.USERNAME.getTestData();
        String validpassword = TestData.PASSWORD.getTestData();
        loginpage.Email().sendKeys(validusername);
        loginpage.password().sendKeys(validpassword);
        loginpage.buttonClick().click();
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
