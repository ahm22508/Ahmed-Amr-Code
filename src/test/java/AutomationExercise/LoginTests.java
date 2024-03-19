package AutomationExercise;

import PagesOFAutomationExercise.HomePage;
import PagesOFAutomationExercise.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTests extends Base {


    String emailContent = "ahmadamr659@gmail.com";
    String passwordContent = "aamrfou55";
    String IncorrectEmail = "ahmadamr69@gmail.coom";
    String IncorrectPassword = "aamrfu55";

    @Test
    public void ValidLogin(){
        LoginPage login = new LoginPage(driver);
        login.Login(emailContent , passwordContent);
        HomePage home = new HomePage();
        boolean AssertCorrectLogin = driver.findElement(home.correctLogin).isDisplayed();
        Assert.assertTrue(AssertCorrectLogin);
    }
    @Test
    public void InValidLogin(){
        LoginPage login = new LoginPage(driver);
        login.Login(IncorrectEmail, IncorrectPassword);
        boolean AssertIncorrectLogin = driver.findElement(login.incorrectogin).isDisplayed();
        Assert.assertTrue(AssertIncorrectLogin);

    }
}
