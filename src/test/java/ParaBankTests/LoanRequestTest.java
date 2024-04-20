package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoanRequestTest extends Base{
    String Amount = "5000";
    String AmountDown = "6000";
    @Test
    public void RequestLoan(){
        new LoginPage(driver).Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).RequestLoan().RequestLoan(Amount, AmountDown);
        Assert.assertTrue(driver.findElement(FinishPage.LoanRequestApproved()).isDisplayed());
    }
}
