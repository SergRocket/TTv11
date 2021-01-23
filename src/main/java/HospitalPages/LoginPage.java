package HospitalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "#identification")
    private WebElement usernameInput;
    @FindBy(css = "#password")
    private WebElement passwordInput;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;
    @FindBy(css = "div[role='alert']")
    private WebElement errorMassage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        waitForElementToBeVisible(usernameInput);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getErrorMessage() {
        waitForElementToBeVisible(errorMassage);
        return errorMassage.getText();
    }
}
