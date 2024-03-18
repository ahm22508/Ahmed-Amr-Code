package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTests extends Base {

    By Email = By.xpath("//input[@data-qa='login-email']");
    By password = By.name("password");
    By login= By.xpath("//button[@type='submit' and text()='Login']");
    By correctLogin= By.xpath("//button[@type='button']");
    By incorrectogin=By.xpath("//p[text()='Your email or password is incorrect!']");

    String emailContent = "ahmadamr659@gmail.com";
    String passwordContent = "aamrfou55";
    String incorrectEmail = "ahmadamr659";
    String incorrectPassword = "aamrfu55";

    @Test
    public void ValidLogin(){
        driver.findElement(Email).sendKeys(emailContent);
        driver.findElement(password).sendKeys(passwordContent);
        driver.findElement(login).click();
        boolean ValidLogin = driver.findElement(correctLogin).isDisplayed();
        Assert.assertTrue(ValidLogin);


    }
    @Test
    public void InValidLogin(){
        driver.findElement(Email).sendKeys(incorrectEmail);
        driver.findElement(password).sendKeys(incorrectPassword);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait.. it applies on all elements and doesn't wait all the determined time but waits till all elements are visible only.
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
        waits.until(ExpectedConditions.elementToBeClickable(login)); //Explicit wait... it applies on one o specific element for the allocated time and till the determined condition gets true
        driver.findElement(login).click();
        boolean invalidlongin= driver.findElement(incorrectogin).isDisplayed();
        Assert.assertTrue(invalidlongin);
    }
}
