package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MedicationPage {
    WebDriver driver;
    By MedicationSection = By.xpath("//*[@id=\"ember767\"]");
    By Requests = By.xpath("//*[@id=\"ember2158\"]");
    By Completed = By.xpath("//*[@id=\"ember2161\"]");
    By NewRequest = By.xpath("//*[@id=\"ember2180\"]");
    By ReturnMedication = By.xpath("//*[@id=\"ember2220\"]");
    By Patient = By.xpath("//*[@id=\"patientTypeAhead-ember2324\"]");
    By VisitDate = By.xpath("//*[@id=\"visit-ember2369\"]");
    By Medication = By.xpath("//*[@id=\"inventoryItemTypeAhead-ember2391\"]");
    By Prescription = By.xpath("//*[@id=\"prescription-ember2423\"]");
    By PrescriptionDate = By.xpath("//*[@id=\"display_prescriptionDate-ember2446\"]");
    By WeekDay = By.xpath("/html/body/div[2]/div/table/thead/tr/th[2]/abbr");
    By Quantity = By.xpath("//*[@id=\"quantity-ember2465\"]");
    By Refils = By.xpath("//*[@id=\"refills-ember2472\"]");
    By AddButton = By.xpath("//*[@id=\"ember2287\"]/div/div[2]/button[2]");
    By modalWin = By.xpath("/html/body/div[1]/div[2]/div/div/div");
    By closeBut = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/button");
    By OKBut = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/button");

    public MedicationPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement MedSec (){

        return driver.findElement(MedicationSection);
    }

    public WebElement Reque (){

        return driver.findElement(Requests);
    }

    public WebElement CompleteD (){

        return driver.findElement(Completed);
    }
    public WebElement Newrequest (){

        return driver.findElement(NewRequest);
    }
    public WebElement ReturnMedic (){

        return driver.findElement(ReturnMedication);
    }
    public WebElement PatienT (){

        return driver.findElement(Patient);
    }

    public WebElement DateVisit (){

        return driver.findElement(VisitDate);
    }
    public WebElement MedicatioN (){

        return driver.findElement(Medication);
    }
    public WebElement PrescriptioN (){

        return driver.findElement(Prescription);
    }
    public  WebElement PrescrDate (){

        return driver.findElement(PrescriptionDate);
    }
    public WebElement QuantitY (){

        return driver.findElement(Quantity);
    }
    public WebElement RefilS (){

        return driver.findElement(Refils);
    }
    public WebElement Addbutton (){

        return driver.findElement(AddButton);
    }
    public WebElement weekDay (){

        return driver.findElement(WeekDay);
    }
    public WebElement ModalWindow (){

        return driver.findElement(modalWin);
    }
    public WebElement CloseBut (){

        return driver.findElement(closeBut);
    }

    public WebElement OKbut(){

        return driver.findElement(OKBut);
    }
}
