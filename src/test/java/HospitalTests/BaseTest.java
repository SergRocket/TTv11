package HospitalTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void beforeLogin() {
      System.setProperty("webdriver.chrome.driver", "target/BrowserDrivers/chromedriver.exe");
      driver = new ChromeDriver();
      String devUrl = TestData.DEVLINK.getTestData();
      driver.get(devUrl);
      driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
      wait = new WebDriverWait(driver, Duration.ofSeconds(9));
    }

    @AfterTest
    public void shuttingDown (){
      driver.close();
      if(driver != null)
      driver.quit();
    }

    public enum TestData {
      DEVLINK("http://demo.hospitalrun.io/#/login"),
      USERNAME("hr.doctor@hospitalrun.io"),
      PASSWORD("HRt3st12"),
      SEARCHFOR("Test Patient"),
      MEDICATION("Pramoxine"),
      PRESCRIPTION("Testing prescription"),
      INVALIDPASSWORD("hr.doctor@hospn.io"),
      INVALIDUSERNAME("HR312");

      private final String testData;
      TestData(String testData){this.testData = testData;}
      public String getTestData(){
          return testData;
      }
    }
}
