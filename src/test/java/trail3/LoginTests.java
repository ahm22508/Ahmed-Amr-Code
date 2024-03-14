package trail3;

import OrangeHRM.HomePage;
import OrangeHRM.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BasePage{

               String validUsername = "Admin";
               String validPassword = "admin123";
               String invalidUsername = "dwadaw";
               String invalidPassword = "dawdawfr";

    @Test
    public void ValidLoegin(){
        LoginPage Login = new LoginPage(driver);
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
        waits.until(ExpectedConditions.visibilityOfElementLocated(Login.UsernameField));
        Login.Login(validUsername, validPassword);
        HomePage homepage = new HomePage();
        waits.until(ExpectedConditions.visibilityOfElementLocated(homepage.CorrectLoginAssert));
        Boolean AssertLoginCorrect = driver.findElement(homepage.CorrectLoginAssert).isDisplayed();
        Assert.assertTrue(AssertLoginCorrect);
    }
@Test
    public void InvalidLogin(){
    LoginPage Login = new LoginPage(driver);
    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
    waits.until(ExpectedConditions.visibilityOfElementLocated(Login.UsernameField));
    Login.Login(invalidUsername , invalidPassword);
    waits.until(ExpectedConditions.visibilityOfElementLocated(Login.ErrorLogin));
    Boolean AssertLoginIncorrect = driver.findElement(Login.ErrorLogin).isDisplayed();
    Assert.assertTrue(AssertLoginIncorrect);

}
}
