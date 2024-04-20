package OrangeHrmTests;

import OrangeHRMPages.LoginPage;
import OrangeHRMPages.UserManagementPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AdminTests extends Base{

    String UserName = "aamrfou";
    String UserNameField = "Admin";
    String Password = "aamrfou55";
    String ConfirmPassword = "aamrfou55";
    String EmployeeHint = "e";
    String Element ="Admin";

    @Test
    public void AddAdminToThePage(){
        new LoginPage(driver).Login(LoginTests.UserName, LoginTests.Password).
                ClickOnAdminButton().ClickOnAddButton().
                AddAdmin(EmployeeHint, UserName, Password, ConfirmPassword);
        Assert.assertTrue(driver.findElement(UserManagementPage.AssertAddAdmin()).isDisplayed());
    }
@Test
    public void DeleteAdminFunction(){
        new LoginPage(driver).Login(LoginTests.UserName, LoginTests.Password).ClickOnAdminButton().DeleteAdmin();
        Assert.assertTrue(driver.findElement(UserManagementPage.DeleteMassage()).isDisplayed());
    }
    @Test
    public void SearchAdminName(){
        new LoginPage(driver).Login(LoginTests.UserName, LoginTests.Password).
                ClickOnAdminButton().
                SearchAdmin(UserNameField, Element);
        Assert.assertTrue(driver.findElement(UserManagementPage.AssertSelectAdmin(Element)).isDisplayed());
    }


}
