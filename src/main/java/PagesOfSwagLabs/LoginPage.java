package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver =driver;
    }
   private By usernameField= By.id("user-name");
    private By passwordField=By.id("password");
    private By login=By.id("login-button");
    private By error=By.className("error-button");

    public By getErrorButton(){
        return error;
    }
    public void Login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(login).click();

    }


}
