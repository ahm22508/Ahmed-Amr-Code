package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
   private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By LogoutButton = By.xpath("//a[text()='Logout']");
    private final By AdminButton = By.xpath("(//span[text()='Admin'])[1]");
    private final By DropDownMenu =By.xpath("//i[@class ='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");



    public static By GetValidLogin(){
        return By.xpath("//h6[text()='Dashboard']");
    }


    public static By GetRecruitmentButton(){
        return By.xpath("//span[text()='Recruitment']");
    }

   public void LogoutThePage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(DropDownMenu));
        driver.findElement(DropDownMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogoutButton));
        driver.findElement(LogoutButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.ReturnUserName()));
   }
   public UserManagementPage ClickOnAdminButton(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AdminButton));
        driver.findElement(AdminButton).click();
        return new UserManagementPage(driver);
   }

    public RecruitmentPage NavigateToRecruitmentPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.GetRecruitmentButton()));
        driver.findElement(HomePage.GetRecruitmentButton()).click();
        return new RecruitmentPage(driver);
    }
}
