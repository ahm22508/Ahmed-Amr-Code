package OrangeHrmTests;

import OrangeHRMPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends Base {

    @Test
    public void LogoutTestCase(){
     new LoginPage(driver).
             Login(LoginTests.UserName, LoginTests.Password).
             LogoutThePage();
     Assert.assertTrue(driver.findElement(LoginPage.ReturnUserName()).isDisplayed());
    }
}
