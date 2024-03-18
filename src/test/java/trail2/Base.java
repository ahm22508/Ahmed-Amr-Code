package trail2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

 public WebDriver driver;
    @BeforeMethod
    public  void  Driver(){
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/login");

    }
    @AfterMethod
    public void Finish(){
        driver.quit();
    }
}
