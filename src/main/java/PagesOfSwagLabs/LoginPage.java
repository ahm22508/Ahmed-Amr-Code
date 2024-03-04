package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By usernameField= By.id("user-name");
    By passwordField=By.id("password");
    By login=By.id("login-button");
    By error=By.className("error-button");
    public void Login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(login).click();

    }


}
