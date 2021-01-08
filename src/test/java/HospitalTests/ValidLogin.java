package HospitalTests;
import HospitalPages.LoginPage;
import HospitalPages.MainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest {

    @Test
    public void validLog () {
        LoginPage LP = new LoginPage(driver);
        MainPage MP = new MainPage(driver);
        String validUsername = TestData.USERNAME.getTestData();
        String validPassword = TestData.PASSWORD.getTestData();
        LP.Email().sendKeys(validUsername);
        LP.Password().sendKeys(validPassword);
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
