package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import com.beust.ah.A;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class UpdateInfoTest extends Base{
    Faker fake = new Faker();
    String FirstName = fake.name().firstName();
    String LastName = fake.name().lastName();
    String Address = fake.address().streetAddress();
    String City = fake.address().cityName();
    String State = fake.address().state();
    String ZipCode = fake.address().zipCode() ;
    String PhoneNumber  =fake.phoneNumber().phoneNumber();


    @DataProvider(name = "TestData")
    public Object[][] TestData(){
        return  new Object[][]{{FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, true},
                {"",LastName, Address, City, State, ZipCode, PhoneNumber, false}};
    }


    @Test(dataProvider = "TestData")
    public void ModifyInfo(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String PhoneNumber, boolean ExpectedResult){
        new LoginPage(driver).
                Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).
                ClickOnUpdateInfo().
                UpdateInfo(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber);
        if(ExpectedResult) {
            Assert.assertTrue(driver.findElement(FinishPage.UpdateInfoCompleted()).isDisplayed());
        }
         else{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.UpdatePageError()));
            Assert.assertTrue(driver.findElement(FinishPage.UpdatePageError()).isDisplayed());
        }
    }
}
