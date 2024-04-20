package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecruitmentPage {
    private  final WebDriver driver;
    public RecruitmentPage(WebDriver driver){
        this.driver = driver;
    }
    public static By GetEyeButton(){
        return By.xpath("(//i[@class='oxd-icon bi-eye-fill'])[1]");
    }
    public EditRecruitmentPage NavigateToRecruitmentEditPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(RecruitmentPage.GetEyeButton()));
        driver.findElement(RecruitmentPage.GetEyeButton()).click();
        return new EditRecruitmentPage(driver);
    }
}
