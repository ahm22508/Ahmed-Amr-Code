package SwagLabs;

import PagesOfSwagLabs.HomePage;
import PagesOfSwagLabs.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {
@Test(dataProvider = "Login")
    public void validLogin(String UserName, String Password) {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        login.Login(UserName, Password);
        boolean AssertLogin = driver.findElement(home.GetHeader()).isDisplayed();
        Assert.assertTrue(AssertLogin);
    }

    @DataProvider(name = "Login")
    public Object[][] DataProviderMethod(){
    Object[][] data = new Object[3][2];
    data[0][0]= "standard_user";
    data[0][1]= "secret_sauce";
    data[1][0]= "problem_user";
    data[1][1]= "secret_sauce";
    data[2][0]="performance_glitch_user";
    data[2][1]="secret_sauce";

    return data;
    }

}











