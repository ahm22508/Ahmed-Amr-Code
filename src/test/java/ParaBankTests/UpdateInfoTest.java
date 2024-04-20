package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateInfoTest extends Base{

    String FirstName = "Ahmed";
    String LastName = "Amr";
    String Address = "Shoubra";
    String City = "Cairo";
    String State = "Shoubra";
    String ZipCode = "58458" ;
    String PhoneNumber  ="01554863523";
    @Test
    public void ModifyInfo(){
        new LoginPage(driver).
                Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).
                ClickOnUpdateInfo().
                UpdateInfo(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber);
        Assert.assertTrue(driver.findElement(FinishPage.UpdateInfoCompleted()).isDisplayed());
    }
}
