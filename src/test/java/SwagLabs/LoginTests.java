package SwagLabs;

import PagesOfSwagLabs.HomePage;
import PagesOfSwagLabs.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class LoginTests extends BaseTest {

        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        String invalidUsername = "InvalidUsername";
        String invalidPassword = "InvalidPassword";

        @Test
        public void validLogin(){
            LoginPage login = new LoginPage(driver);
            HomePage home = new HomePage(driver);
            login.Login(validUsername , validPassword);
            boolean isHeaderDisplayed = driver.findElement(home.GetHeader()).isDisplayed();
            Assert.assertTrue(isHeaderDisplayed);
        }

        @Test
        public void invalidLogin(){
            LoginPage login = new LoginPage(driver);
            login.Login(invalidUsername, invalidPassword);
            boolean isErrorDisplayed = driver.findElement(login.getErrorButton()).isDisplayed();
            Assert.assertTrue(isErrorDisplayed);
        }
    }

