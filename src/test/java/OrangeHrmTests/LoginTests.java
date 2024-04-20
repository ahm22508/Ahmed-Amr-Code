package OrangeHrmTests;

import OrangeHRMPages.HomePage;
import OrangeHRMPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends Base{
   static String UserName = "Admin";
    static String Password ="admin123";
    static String InvalidUserName = "adm";
    static String InvalidPassword = "adm11";

    @Test
    public void ValidLogin(){
       new LoginPage(driver).Login(UserName, Password);
        Assert.assertTrue(driver.findElement(HomePage.GetValidLogin()).isDisplayed());


    }
    @Test
    public void InValidLogin(){
        new LoginPage(driver).Login(InvalidUserName, InvalidPassword);
        Assert.assertTrue(driver.findElement(LoginPage.GetErrorLoginButton()).isDisplayed());
    }
}
