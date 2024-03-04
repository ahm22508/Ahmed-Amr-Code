package PagesOFAutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By Email = By.xpath("//input[@data-qa='login-email']");
    By Password = By.name("password");
    By login= By.xpath("//button[@type='submit' and text()='Login']");
    By incorrectogin=By.xpath("//p[text()='Your email or password is incorrect!']");

    public void Login(String userName , String password){
        driver.findElement(Email).sendKeys(userName);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(login).click();
}

}
