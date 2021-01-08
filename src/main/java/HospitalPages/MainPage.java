package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    public MainPage (WebDriver driver){this.driver=driver;}
    WebDriver driver;
    By CogWheel = By.cssSelector("#ember412 > nav > header > a.settings-trigger");
    By LogoutButton = By.cssSelector("#ember412 > nav > header > nav > a.logout");
    By Imageafterlogin = By.cssSelector("#ember737");

    public WebElement cogWheel (){
        return driver.findElement(CogWheel);
    }
    public WebElement logOut (){
        return driver.findElement(LogoutButton);
    }
    public WebElement imageafterLog (){return driver.findElement(Imageafterlogin);}
}
