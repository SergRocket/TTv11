package HospitalTests;

import HospitalPages.pages.LoginPage;
import HospitalPages.pages.MedicationPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AppConfig;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MedicalRequest extends BaseTest {

    @Test
    public void medicationRequest () {
        LoginPage loginPage = new LoginPage(driver);
        String validUsername = AppConfig.USERNAME;
        String validPassword = AppConfig.PASSWORD;
        loginPage.login(validUsername, validPassword);
        MedicationPage medicationPage = new MedicationPage(driver);
        String searchFor = AppConfig.SEARCHFOR;
        String medication = AppConfig.MEDICATION;
        String prescription = AppConfig.PRESCRIPTION;
        medicationPage.medicRequest(searchFor, medication, prescription);
        Assert.assertTrue(driver.getCurrentUrl().contains("medication/edit/new"));
    }
}
