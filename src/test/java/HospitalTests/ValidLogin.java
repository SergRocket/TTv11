package HospitalTests;

import HospitalPages.LoginPage;
import HospitalPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ValidLogin extends BaseTest {

    @Test
    public void validLog() throws InterruptedException {
        LoginPage LP = new LoginPage(driver);
        MainPage MP = new MainPage(driver);
        String validusername = TestData.USERNAME.getTestData();
        String validpassword = TestData.PASSWORD.getTestData();
        LP.Email().sendKeys(validusername);
        LP.Password().sendKeys(validpassword);
        LP.ButtonClick().click();
        wait.until(ExpectedConditions.visibilityOf(MP.imageafterLog()));
        wait.until(ExpectedConditions.urlContains("#/patients"));
    }
    /*public static void main (String[] args) throws InterruptedException {
        ValidLogin VL = new ValidLogin();
        VL.BeforeLogin();
        VL.ValidLog();
        VL.ShuttingDown();

    }*/

}
