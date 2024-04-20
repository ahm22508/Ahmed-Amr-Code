package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
  public LoginPage(WebDriver driver){
      this.driver = driver;
  }
    private final By usernameField= By.id("user-name");
    private final By passwordField=By.id("password");
    private final By login=By.id("login-button");
    private final By error=By.className("error-button");

   public By GetErrorButtton(){
       return error;
   }
    public  HomePage Login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(login).click();
    return new HomePage(driver);
   }
}
