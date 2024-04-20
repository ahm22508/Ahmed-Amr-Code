package ParaBankTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class Base {
    public WebDriver driver;
    @BeforeMethod
    public void StartDriver(){
        driver =  new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }
//    @AfterMethod
//    public void EndDriver(){driver.quit();}
}
