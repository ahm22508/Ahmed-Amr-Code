package ParaBankTests;

import ParaBankPages.HomePage;
import ParaBankPages.LoginPage;
import ParaBankPages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterAndLoginTests extends Base {
   static Faker fake = new Faker();

    String FirstName = fake.name().firstName();
    String LastName = fake.name().lastName();
    String Address = fake.address().firstName();
    String City = fake.address().cityName();
    String State = fake.address().state();
    String ZipCode = fake.address().zipCode();
    String PhoneNumber  =fake.phoneNumber().phoneNumber();
    String SSN = fake.idNumber().validSvSeSsn();
    static String UserName= fake.name().username();
    static String Password = "aamrfou55";
    String ConfirmPassword= "aamrfou55";
    String InvalidUserName = "aamrf";
    String InvalidPassword = "aamrfou";

    @DataProvider(name = "Data")
    public Object[][] DataCase(){
        return new Object[][]{
                {FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, SSN, UserName, Password, ConfirmPassword,true},
                {FirstName, "", Address, City, State, ZipCode, PhoneNumber, SSN, InvalidUserName, Password, ConfirmPassword, false},
                {"", LastName, Address, City, State, ZipCode, PhoneNumber, SSN, UserName, Password, ConfirmPassword,false},
        };
    }

    @Test(dataProvider = "Data")
    public void ValidRegister(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String SSN,String userName, String password, String confirmPassword, boolean FinalResult){
        new LoginPage(driver).GoToRegisterPage().RegisterToSite(firstName, lastName, address, city, state, zipCode, phoneNumber, SSN, userName, password, confirmPassword);
        if (FinalResult) {
            Assert.assertTrue(driver.findElement(HomePage.OpenNewAccount()).isDisplayed());
        }
        else{
            Assert.assertTrue(driver.findElement(RegisterPage.AssertErrorRegister()).isDisplayed());
        }
        }
@Test
    public void inValidRegister(){

          new LoginPage(driver).GoToRegisterPage().RegisterToSite(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, SSN, UserName, Password, ConfirmPassword);
        Assert.assertTrue(driver.findElement(RegisterPage.AssertErrorRegister()).isDisplayed());
    }
    @Test
    public void ValidLogin(){
        new LoginPage(driver).Login(UserName,Password);
        Assert.assertTrue(driver.findElement(HomePage.OpenNewAccount()).isDisplayed());
    }
    @Test
    public void InvalidLogin(){
        new LoginPage(driver).Login(InvalidUserName,InvalidPassword);
        Assert.assertTrue(driver.findElement(LoginPage.AssertErrorLogin()).isDisplayed());
    }


}
