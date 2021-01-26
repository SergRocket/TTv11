package qa.hospital;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import qa.hospital.pages.LoginPage;
import qa.hospital.utils.AppConfig;

public class ValidLogin extends BaseTest {

    @Test
    public void validLog () {
        LoginPage loginPage = new LoginPage(driver);
        String validUsername = AppConfig.USERNAME;
        String validPassword = AppConfig.PASSWORD;
        loginPage.login(validUsername, validPassword);
        wait.until(ExpectedConditions.urlContains("#/patients"));
    }
}
