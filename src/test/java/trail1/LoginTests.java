package trail1;

import PagesOfSwagLabs.HomePage;
import PagesOfSwagLabs.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class LoginTests extends BaseTest {





        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        String invalidUsername = "dwadaw";
        String invalidPassword = "dawdawfr";

        @Test
        public void validLogin(){
            LoginPage login = new LoginPage(driver);
            login.Login(validUsername , validPassword);
            HomePage home = new HomePage(driver);
            boolean isHeaderDisplayed = driver.findElement(home.header).isDisplayed();
            Assert.assertTrue(isHeaderDisplayed);
        }

        @Test
        public void invalidLogin(){
            LoginPage login = new LoginPage(driver);
            login.Login(invalidUsername, invalidPassword);
            boolean isErrorDisplayed = driver.findElement(login.error).isDisplayed();
            Assert.assertTrue(isErrorDisplayed);
        }


    }

