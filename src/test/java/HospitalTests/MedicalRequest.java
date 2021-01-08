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
        loginPage.Password().sendKeys(validpassword);
        loginPage.ButtonClick().click();
        MedicationPage medicationPage = new MedicationPage(driver);
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.PatienT(), medicationPage.MedicatioN()));
        medicationPage.MedSec().click();
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.Reque(), medicationPage.CompleteD(),
                medicationPage.ReturnMedic(), medicationPage.Newrequest()));
        medicationPage.Newrequest().click();
        medicationPage.PatienT().click();
        String searchFor = TestData.SEARCHFOR.getTestData();
        medicationPage.PatienT().sendKeys(searchFor);
        int i=1;
        while(i<3){
            medicationPage.PatienT().sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        medicationPage.PatienT().sendKeys(Keys.ENTER);
        medicationPage.DateVisit().click();
        int c=1;
        while(c<4) {
            medicationPage.DateVisit().sendKeys(Keys.ARROW_DOWN);
            c++;
        }
        medicationPage.DateVisit().sendKeys(Keys.ENTER);
        String medication = TestData.MEDICATION.getTestData();
        medicationPage.MedicatioN().sendKeys(medication);
        medicationPage.MedicatioN().sendKeys(Keys.ARROW_DOWN);
        medicationPage.MedicatioN().sendKeys(Keys.ENTER);
        String prescription = TestData.PRESCRIPTION.getTestData();
        medicationPage.PrescriptioN().sendKeys(prescription);
        medicationPage.PrescrDate().click();
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.weekDay()));
        medicationPage.weekDay().click();
        medicationPage.PrescrDate().sendKeys(Keys.ARROW_LEFT);
        medicationPage.PrescrDate().sendKeys(Keys.ENTER);
        Random rand = new Random();
        int qr = rand.nextInt(1)+3;
        int qrf = rand.nextInt(5)+8;
        String QR = Integer.toString(qr);
        String QRef = Integer.toString(qrf);
        medicationPage.QuantitY().sendKeys(QR);
        medicationPage.RefilS().sendKeys(QRef);
        medicationPage.Addbutton().click();
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.ModalWindow(), medicationPage.OKbut(),
                medicationPage.CloseBut()));
        boolean popUp = (medicationPage.ModalWindow().isDisplayed() && medicationPage.OKbut().isDisplayed() &&
                medicationPage.CloseBut().isDisplayed());
        if (popUp){
            System.out.print("The pop is displayed after clicking Add button ");
        } else {
            System.out.println("The pop up is not shown after clicking Add button");
        }
        wait.until(ExpectedConditions.visibilityOfAllElements(medicationPage.ModalWindow()));
        medicationPage.OKbut().click();
        try {
            medicationPage.ModalWindow().isDisplayed();
        } catch (Exception e){
            System.out.println(" The pop up is gone, as expected");
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("medication/edit/new"));
    }
}
