package OrangeHrmTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  class Base {
    public static WebDriver driver;


    @BeforeMethod
    public void StartTest(){
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
@AfterMethod
    public void EndTest(){
        driver.quit();
    }
}
