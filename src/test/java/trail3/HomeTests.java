package trail3;

import OrangeHRM.AdminPage;
import OrangeHRM.HomePage;
import OrangeHRM.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTests extends Base {
    String validUsername = "Admin";
    String validPassword = "admin123";
    @Test
    public void NavigateToAdminPage(){
        LoginPage login = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(login.UsernameField));
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(home.AdminButton));
        home.NavigateAdminButton();
        AdminPage admin = new AdminPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(admin.AssertToAdminPage));
        Boolean AssertNavigation = driver.findElement(admin.AssertToAdminPage).isDisplayed();
        Assert.assertTrue(AssertNavigation);

    }


}
