package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillPayTest extends Base {
        String Name;
        String Address = "Shoubra";
        String City = "Cairo";
        String State = "Shoubra";
        String ZipCode = "55690";
        String Phone = "01550810058";
        String Account = "493449";
        String VerifyAccount = "493449";
        String Amount = "500";
        Faker faker = new Faker();
    @Test
    public void PayBills(){
        System.out.println(faker.name());
        new LoginPage(driver).Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).ClickOnBillPay().BillPay(Name,Address, City, State, ZipCode, Phone, Account, VerifyAccount,Amount);
        Assert.assertTrue(driver.findElement(FinishPage.PillPayComplete()).isDisplayed());
    }
}