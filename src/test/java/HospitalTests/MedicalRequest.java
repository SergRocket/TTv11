package HospitalTests;

import HospitalPages.LoginPage;
import HospitalPages.MedicationPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MedicalRequest extends BaseTest {

    @Test
    public void medicationRequest () {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        String validusername = TestData.USERNAME.getTestData();
        String validpassword = TestData.PASSWORD.getTestData();
        loginPage.Email().sendKeys(validusername);
        loginPage.password().sendKeys(validpassword);
        loginPage.buttonClick().click();
        MedicationPage medicationPage = new MedicationPage(driver);
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.patients(), medicationPage.medication()));
        medicationPage.medSec().click();
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.reque(), medicationPage.completed(),
                medicationPage.returnMedic(), medicationPage.newRequest()));
        medicationPage.newRequest().click();
        medicationPage.patient().click();
        String searchFor = TestData.SEARCHFOR.getTestData();
        medicationPage.patient().sendKeys(searchFor);
        int i=1;
        while(i<3){
            medicationPage.patient().sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        medicationPage.patient().sendKeys(Keys.ENTER);
        medicationPage.dateVisit().click();
        int c=1;
        while(c<4) {
            medicationPage.dateVisit().sendKeys(Keys.ARROW_DOWN);
            c++;
        }
        medicationPage.dateVisit().sendKeys(Keys.ENTER);
        String medication = TestData.MEDICATION.getTestData();
        medicationPage.medication().sendKeys(medication);
        medicationPage.medication().sendKeys(Keys.ARROW_DOWN);
        medicationPage.medication().sendKeys(Keys.ENTER);
        String prescription = TestData.PRESCRIPTION.getTestData();
        medicationPage.prescription().sendKeys(prescription);
        medicationPage.prescrDate().click();
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.weekDay()));
        medicationPage.weekDay().click();
        medicationPage.prescrDate().sendKeys(Keys.ARROW_LEFT);
        medicationPage.prescrDate().sendKeys(Keys.ENTER);
        Random rand = new Random();
        int qr = rand.nextInt(1)+3;
        int qrf = rand.nextInt(5)+8;
        String QR = Integer.toString(qr);
        String QRef = Integer.toString(qrf);
        medicationPage.quantity().sendKeys(QR);
        medicationPage.refils().sendKeys(QRef);
        medicationPage.addButton().click();
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.modalWindow(), medicationPage.oKBut(),
                medicationPage.closeBut()));
        boolean popUp = (medicationPage.modalWindow().isDisplayed() && medicationPage.oKBut().isDisplayed() &&
                medicationPage.closeBut().isDisplayed());
        if (popUp){
            System.out.print("The pop is displayed after clicking Add button ");
        } else {
            System.out.println("The pop up is not shown after clicking Add button");
        }
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.modalWindow()));
        medicationPage.oKBut().click();
        try {
            medicationPage.modalWindow().isDisplayed();
        } catch (Exception e){
            System.out.println(" The pop up is gone, as expected");
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("medication/edit/new"));
    }
}
