package qa.hospital;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import qa.hospital.pages.LoginPage;
import qa.hospital.utils.AppConfig;

public class ValidLogin extends BaseTest {

    @Test
    public void validLog () {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(AppConfig.USERNAME, AppConfig.PASSWORD);

        wait.until(ExpectedConditions.urlContains("#/patients"));
    }
}
