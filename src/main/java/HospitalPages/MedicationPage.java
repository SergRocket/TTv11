package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MedicationPage {
    private WebDriver driver;
    private By MedicationSection = By.cssSelector("#ember767");
    private By Requests = By.cssSelector("#ember2177");
    private By Completed = By.cssSelector("#ember2180");
    private By NewRequest = By.cssSelector("#ember2495");
    private By ReturnMedication = By.cssSelector("#ember2239");
    private By Patients = By.cssSelector("#ember727");
    private By Patient = By.cssSelector("#patientTypeAhead-ember2546");
    private By VisitDate = By.cssSelector("#visit-ember2591");
    private By Medication = By.cssSelector("#ember767");
    private By Prescription = By.cssSelector("#prescription-ember2645");
    private By PrescriptionDate = By.cssSelector("#display_prescriptionDate-ember2668");
    private By WeekDay = By.cssSelector("body > div.pika-single.is-bound.is-hidden > div");
    private By Quantity = By.cssSelector("#quantity-ember2687");
    private By Refils = By.cssSelector("#refills-ember2694");
    private By AddButton = By.cssSelector("#ember2509 > div > div.panel-footer > button.btn.btn-primary.on-white.disabled-btn");
    private By modalWin = By.cssSelector("#ember2963 > div > div > div");
    private By closeBut = By.cssSelector("#ember2963 > div > div > div > div.modal-header > button > span");
    private By OKBut = By.cssSelector("#ember2963 > div > div > div > div.modal-footer > button");

    public MedicationPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement medSec (){

        return driver.findElement(MedicationSection);
    }

    public WebElement reque (){

        return driver.findElement(Requests);
    }

    public WebElement completed (){

        return driver.findElement(Completed);
    }
    public WebElement newRequest (){

        return driver.findElement(NewRequest);
    }
    public WebElement returnMedic (){

        return driver.findElement(ReturnMedication);
    }
    public WebElement patient (){

        return driver.findElement(Patient);
    }

    public WebElement dateVisit (){

        return driver.findElement(VisitDate);
    }
    public WebElement medication (){

        return driver.findElement(Medication);
    }
    public WebElement prescription (){

        return driver.findElement(Prescription);
    }
    public  WebElement prescrDate (){

        return driver.findElement(PrescriptionDate);
    }
    public WebElement quantity (){

        return driver.findElement(Quantity);
    }
    public WebElement refils (){

        return driver.findElement(Refils);
    }
    public WebElement addButton (){

        return driver.findElement(AddButton);
    }
    public WebElement weekDay (){

        return driver.findElement(WeekDay);
    }
    public WebElement modalWindow (){

        return driver.findElement(modalWin);
    }
    public WebElement closeBut (){

        return driver.findElement(closeBut);
    }

    public WebElement oKBut(){

        return driver.findElement(OKBut);
    }
    public WebElement patients (){
        return  driver.findElement(Patients);
    }
}
