package OrangeHRM;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends Base {

    String validUsername = "Admin";
    String validPassword = "admin123";
    String invalidUsername = "IncorrectUser";
    String invalidPassword = "IncorrectPassword";

    @Test
    public void ValidLogin(){
        LoginPage login = new LoginPage(driver);
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
        waits.until(ExpectedConditions.visibilityOfElementLocated(login.UsernameField));
        login.Login(validUsername , validPassword);
        HomePage home = new HomePage(driver);
        waits.until(ExpectedConditions.visibilityOfElementLocated(home.CorrectLoginAssert));
        boolean AssertLoginCorrect = driver.findElement(home.CorrectLoginAssert).isDisplayed();
        Assert.assertTrue(AssertLoginCorrect);
    }
    @Test
    public void InvalidLogin(){
    LoginPage Login = new LoginPage(driver);
    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
    waits.until(ExpectedConditions.visibilityOfElementLocated(Login.UsernameField));
    Login.Login(invalidUsername , invalidPassword);
    waits.until(ExpectedConditions.visibilityOfElementLocated(Login.ErrorLogin));
    boolean AssertLoginIncorrect = driver.findElement(Login.ErrorLogin).isDisplayed();
    Assert.assertTrue(AssertLoginIncorrect);
    }
}
