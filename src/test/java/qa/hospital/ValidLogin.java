package qa.hospital;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import qa.hospital.pages.LoginPage;
import qa.hospital.pages.MainPage;
import qa.hospital.utils.AppConfig;

public class ValidLogin extends BaseTest {

    @Test
    public void validLog () {
        LoginPage LP = new LoginPage(driver);
        MainPage MP = new MainPage(driver);
        String validUsername = AppConfig.USERNAME;
        String validPassword = AppConfig.PASSWORD;
        LP.login(validUsername, validPassword);
        wait.until(ExpectedConditions.visibilityOf(MP.imageAfterLog()));
        wait.until(ExpectedConditions.urlContains("#/patients"));
    }
    /*public static void main (String[] args) throws InterruptedException {
        ValidLogin VL = new ValidLogin();
        VL.BeforeLogin();
        VL.ValidLog();
        VL.ShuttingDown();

    }*/

}
