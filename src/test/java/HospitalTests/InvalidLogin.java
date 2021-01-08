package HospitalTests;
import HospitalPages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {
    @Test
    public void invalidlogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String invalidusername = TestData.INVALIDUSERNAME.getTestData();
        String invalidpassword = TestData.INVALIDPASSWORD.getTestData();
        loginPage.Email().sendKeys(invalidusername);
        loginPage.Password().sendKeys(invalidpassword);
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
