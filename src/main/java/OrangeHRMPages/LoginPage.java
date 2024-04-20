package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
   private final WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private  final By PasswordField = By.xpath("//input[@name='password']");
    private  final By LoginButton = By.xpath("//button[@type='submit']");

    public static By ReturnUserName(){
        return By.xpath("//input[@name='username']");
    }
    public static By GetErrorLoginButton(){
      return By.xpath("//p[text()='Invalid credentials']");
    }
    public HomePage Login(String UserName, String Password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ReturnUserName()));
        driver.findElement(ReturnUserName()).sendKeys(UserName);
        driver.findElement(PasswordField).sendKeys(Password);
        if(UserName.equals("Admin")) {
            driver.findElement(LoginButton).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.GetValidLogin()));
        }
        else {
            driver.findElement(LoginButton).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.GetErrorLoginButton()));
        }
    return new HomePage(driver);
    }
}
