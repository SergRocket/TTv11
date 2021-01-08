package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver = driver;}
    private By username = By.cssSelector("#identification");
    private By password = By.cssSelector("#password");
    private By pressLogin = By.cssSelector("#ember412 > div > form > div.signin-contents > button");
    private By error = By.cssSelector("#ember412 > div > form > div.signin-contents > div.alert.alert-danger.form-signin-alert");

    public WebElement Email (){
        return  driver.findElement(username);
    }

    public WebElement Password (){
        return driver.findElement(password);
    }

    public WebElement ButtonClick (){
        return driver.findElement(pressLogin);
    }

    public WebElement Error () {
        return driver.findElement(error);
    }
}
