package OrangeHrmTests;

import OrangeHRMPages.EditRecruitmentPage;
import OrangeHRMPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecruitmentTests extends Base{
    String FirstName = "Juan";
    String MiddleName = "Raul";
    String LastName = "Antonio";

    @Test
    public void EditRecruitmentFunction(){
      new LoginPage(driver).
              Login(LoginTests.UserName, LoginTests.Password).NavigateToRecruitmentPage().
              NavigateToRecruitmentEditPage().
              EditRecruitment(FirstName, MiddleName,LastName);
        Assert.assertTrue(driver.findElement(EditRecruitmentPage.GetNotificacionMassage()).isDisplayed());
    }
}
