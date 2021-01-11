package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver = driver;}
    private By username = By.cssSelector("#identification");
    private By password = By.cssSelector("#password");
    private By pressLogin = By.cssSelector("button[type='submit']");
    private By errorMassage = By.cssSelector("div[role='alert']");

    public WebElement Email (){
        return  driver.findElement(username);
    }

    public WebElement password (){
        return driver.findElement(password);
    }

    public WebElement buttonClick (){
        return driver.findElement(pressLogin);
    }

    public WebElement errorBlock () {
        return driver.findElement(errorMassage);
    }
}
