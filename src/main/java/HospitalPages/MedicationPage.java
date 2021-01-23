package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MedicationPage extends BasePage {
    private By medicationSection = By.cssSelector("#ember767");
    private By requests = By.cssSelector("#ember2177");
    private By completed = By.cssSelector("#ember2180");
    private By newRequest = By.cssSelector("#ember2495");
    private By returnMedication = By.cssSelector("#ember2239");
    private By patients = By.cssSelector("#ember727");
    private By patient = By.cssSelector("#patientTypeAhead-ember2546");
    private By visitDate = By.cssSelector("#visit-ember2591");
    private By medication = By.cssSelector("#ember767");
    private By prescription = By.cssSelector("#prescription-ember2645");
    private By prescriptionDate = By.cssSelector("#display_prescriptionDate-ember2668");
    private By weekDay = By.cssSelector("body > div.pika-single.is-bound.is-hidden > div");
    private By quantity = By.cssSelector("#quantity-ember2687");
    private By refils = By.cssSelector("#refills-ember2694");
    private By addButton = By.cssSelector("#ember2509 > div > div.panel-footer > button.btn.btn-primary.on-white.disabled-btn");
    private By modalWin = By.cssSelector("#ember2963 > div > div > div");
    private By closeBut = By.cssSelector("#ember2963 > div > div > div > div.modal-header > button > span");
    private By oKButton = By.cssSelector("#ember2963 > div > div > div > div.modal-footer > button");

    public MedicationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement medSec() {
        return driver.findElement(medicationSection);
    }

    public WebElement reque() {
        return driver.findElement(requests);
    }

    public WebElement completed() {
        return driver.findElement(completed);
    }

    public WebElement newRequest() {
        return driver.findElement(newRequest);
    }

    public WebElement returnMedic() {
        return driver.findElement(returnMedication);
    }

    public WebElement patient() {
        return driver.findElement(patient);
    }

    public WebElement dateVisit() {
        return driver.findElement(visitDate);
    }

    public WebElement medication() {
        return driver.findElement(medication);
    }

    public WebElement prescription() {
        return driver.findElement(prescription);
    }

    public WebElement prescrDate() {
        return driver.findElement(prescriptionDate);
    }

    public WebElement quantity() {
        return driver.findElement(quantity);
    }

    public WebElement refils() {
        return driver.findElement(refils);
    }

    public WebElement addButton() {
        return driver.findElement(addButton);
    }

    public WebElement weekDay() {
        return driver.findElement(weekDay);
    }

    public WebElement modalWindow() {
        return driver.findElement(modalWin);
    }

    public WebElement closeBut() {
        return driver.findElement(closeBut);
    }

    public WebElement oKBut() {
        return driver.findElement(oKButton);
    }

    public WebElement patients() {
        return driver.findElement(patients);
    }
}
