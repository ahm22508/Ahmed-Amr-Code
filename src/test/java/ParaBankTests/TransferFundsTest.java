package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends Base{

    String Money = "50000";
    @Test
    public void TransferFunds(){
        new LoginPage(driver).Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).ClickOnTransferFunds().TransferFunds(Money);
        Assert.assertTrue(driver.findElement(FinishPage.TransferComplete()).isDisplayed());
    }
}
