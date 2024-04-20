package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTest extends Base{
    @Test
    public void OpenNewAccount(){
        new LoginPage(driver).Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).ClickOnOpenNewAccount().OpenNewAccount();
       Assert.assertTrue(driver.findElement(FinishPage.GetAccountOpened()).isDisplayed());
    }
}
