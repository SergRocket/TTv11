package qa.hospital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private By CogWheel = By.cssSelector("#ember412 > nav > header > a.settings-trigger");
    private By LogoutButton = By.cssSelector("#ember412 > nav > header > nav > a.logout");
    private By Imageafterlogin = By.cssSelector("#ember767");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement cogWheel() {
        return driver.findElement(CogWheel);
    }

    public WebElement logOut() {
        return driver.findElement(LogoutButton);
    }

    public WebElement imageAfterLog() {
        return driver.findElement(Imageafterlogin);
    }
}
