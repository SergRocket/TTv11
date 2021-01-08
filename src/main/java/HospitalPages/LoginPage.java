package HospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){this.driver=driver;}
    By username = By.cssSelector("#identification");
    By password = By.cssSelector("#password");
    By pressLogin = By.cssSelector("#ember412 > div > form > div.signin-contents > button");
    By error = By.cssSelector("#ember412 > div > form > div.signin-contents > div.alert.alert-danger.form-signin-alert");

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
