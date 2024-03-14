package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

   public By UsernameField = By.xpath("//input[@name='username']");
    By PasswordField = By.xpath("//input[@name='password']");
    By LoginButton = By.xpath("//button[@type='submit']");
   public By ErrorLogin = By.xpath("//*[text()='Invalid credentials']");

    public void Login(String username, String Password){
        driver.findElement(UsernameField).sendKeys(username);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(LoginButton).click();
    }
}
