package HospitalTests;
import HospitalPages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {
    @Test
    public void invalidLogin () {
        LoginPage loginPage = new LoginPage(driver);
        String invalidUsername = TestData.INVALIDUSERNAME.getTestData();
        String invalidPassword = TestData.INVALIDPASSWORD.getTestData();
        loginPage.Email().sendKeys(invalidUsername);
        loginPage.Password().sendKeys(invalidPassword);
        loginPage.ButtonClick().click();
        wait.until(ExpectedConditions.visibilityOf(loginPage.Error()));
        boolean errorMessage = loginPage.Error().isDisplayed();
        if (errorMessage)
            System.out.print("The error message is shown");
        else System.out.print("The error message is missing");
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }

    /*public static void main (String [] args)throws Exception {
        InvalidLogin IL = new InvalidLogin();
        IL.BeforeLogin();
        IL.Invalidlogin();
        IL.ShuttingDown();
    }*/

}
