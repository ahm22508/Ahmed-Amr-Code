package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditRecruitmentPage {
    private final WebDriver driver;
    public EditRecruitmentPage(WebDriver driver){
        this.driver = driver;
    }
    private final By MiddleNameField = By.xpath("//input[@name='middleName']");
    private  final By LastNameField = By.xpath("//input[@name='lastName']");
    private  final  By SaveButton = By.xpath("//button[text()=' Save ']");

    public static By GetNotificacionMassage(){
        return By.xpath("//p[text()='Successfully Updated']");
    }
    public static By GetFirstNameField(){
        return By.xpath("//input[@name='firstName']");
    }

    public static By GetEditButton(){
        return By.xpath("//label[text()='Edit']");
    }

    public void EditRecruitment(String FirstName, String MiddleName, String LastName){
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EditRecruitmentPage.GetEditButton()));
        driver.findElement(EditRecruitmentPage.GetEditButton()).click();
        action.click(driver.findElement(EditRecruitmentPage.GetFirstNameField())).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).build().perform();
        driver.findElement(EditRecruitmentPage.GetFirstNameField()).sendKeys(FirstName);
        action.click(driver.findElement(MiddleNameField)).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).build().perform();
        driver.findElement(MiddleNameField).sendKeys(MiddleName);
        action.click(driver.findElement(LastNameField)).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).build().perform();
        driver.findElement(LastNameField).sendKeys(LastName);
        driver.findElement(SaveButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(EditRecruitmentPage.GetNotificacionMassage()));

    }

}
