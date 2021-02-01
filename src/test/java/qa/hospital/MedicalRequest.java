package qa.hospital;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.hospital.pages.LoginPage;
import qa.hospital.pages.MedicationPage;
import qa.hospital.utils.AppConfig;

public class MedicalRequest extends BaseTest {

    @Test
    public void medicationRequest () {
        LoginPage loginPage = new LoginPage(driver);
        String validUsername = AppConfig.USERNAME;
        String validPassword = AppConfig.PASSWORD;
        loginPage.login(validUsername, validPassword);

        MedicationPage medicationPage = new MedicationPage(driver);

        medicationPage.requestNewItemClick();
        medicationPage.dataInput(AppConfig.SEARCHFOR, AppConfig.MEDICATION, AppConfig.PRESCRIPTION);
        medicationPage.addRequestClick();
//        medicationPage.isPopupDisplayed();
//        medicationPage.confirmationPopClosing();

        Assert.assertTrue(medicationPage.isPopupDisplayed());
    }
}
