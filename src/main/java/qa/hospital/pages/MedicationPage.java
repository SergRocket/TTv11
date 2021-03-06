package qa.hospital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import qa.hospital.utils.AppConfig;

import java.util.List;
import java.util.Random;

public class MedicationPage extends BasePage {
    @FindBy(css="#ember767")
    private WebElement medicationSection;
    @FindBy(css="#ember2177")
    private WebElement requests;
    @FindBy(css="#ember2180")
    private WebElement completed;
    @FindBy(css="#ember2495")
    private WebElement newRequest;
    @FindBy(css="#ember2239")
    private WebElement returnMedication;
    @FindBy(css="#ember727")
    private WebElement patients;
    @FindBy(css="#patientTypeAhead-ember2546")
    private WebElement patient ;
    @FindBy(css="#visit-ember2591")
    private WebElement visitDate;
    @FindBy(css="#ember767")
    private WebElement medication;
    @FindBy(css="#prescription-ember2645")
    private WebElement prescription;
    @FindBy(css="#display_prescriptionDate-ember2668")
    private WebElement prescriptionDate;
    @FindBy(css="body > div.pika-single.is-bound.is-hidden > div")
    private WebElement weekDay;
    @FindBy(css="#quantity-ember2687")
    private WebElement quantit;
    @FindBy(css="#refills-ember2694")
    private WebElement refils;
    @FindBy(css="#ember2509 > div > div.panel-footer > button.btn.btn-primary.on-white.disabled-btn")
    private WebElement addButton;
    @FindBy(css="#ember2963 > div > div > div")
    private WebElement modalWin;
    @FindBy(css="#ember2963 > div > div > div > div.modal-header > button > span")
    private WebElement closeBut;
    @FindBy(css="#ember2963 > div > div > div > div.modal-footer > button")
    private WebElement oKButton;

    public MedicationPage(WebDriver driver){super(driver);}

    public void requestNewItemClick(){
        waitForElementToBeVisible(medicationSection);
        medicationSection.click();
        waitForElementToBeVisible(newRequest);
        newRequest.click();
    }
    public void dataInput(String searchFor,String medications, String prescriptions){
        clickElement(patient);
        patient.sendKeys(searchFor);
        clickArrowDown(6, patients);
        patients.sendKeys(Keys.ENTER);
        visitDate.click();
        clickArrowDown(5, visitDate);
        visitDate.sendKeys(Keys.ENTER);
        medication.sendKeys(medications);
        medication.sendKeys(Keys.ARROW_DOWN);
        medication.sendKeys(Keys.ENTER);
        prescription.sendKeys(prescriptions);
        prescriptionDate.click();
        waitForElementToBeVisible(weekDay);
        weekDay.click();
        prescriptionDate.sendKeys(Keys.ARROW_LEFT);
        prescriptionDate.sendKeys(Keys.ENTER);
        Random rand = new Random();
        int qr = rand.nextInt(1)+3;
        int qrf = rand.nextInt(5)+8;
        String QR = Integer.toString(qr);
        String QRef = Integer.toString(qrf);
        quantit.sendKeys(QR);
        refils.sendKeys(QRef);
    }
    public void addRequestClick(){
        waitForElementToBeVisible(addButton);
        addButton.click();
    }
    public boolean isPopupDisplayed(){
        return modalWin.isDisplayed() && oKButton.isDisplayed() && closeBut.isDisplayed();
    }
    public boolean confirmationPopClosing(){
        waitForElementToBeVisible(modalWin);
        oKButton.click();
        try {
            modalWin.isDisplayed();
        } catch (Exception e){
            System.out.println(" The pop up is gone, as expected");
        }
        boolean afterClosingPopUp=driver.getCurrentUrl().contains("medication/edit/new");
        return afterClosingPopUp;
}

}
