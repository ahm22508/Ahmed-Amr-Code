package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserManagementPage {
    private final WebDriver driver;
    public UserManagementPage(WebDriver driver){
        this.driver = driver;
    }

    private final By DeleteButton = By.xpath("(//i[@class='oxd-icon bi-trash'])[2]");
    private final By AlertDelete = By.xpath("//button[text()=' Yes, Delete ']");
    private final By UserNameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By SearchButton= By.xpath("//button[text()=' Search ']");

    public static By AddButton(){
        return By.xpath("//button[text()=' Add ']");
    }
    public static By AssertAddAdmin(){
        return By.xpath("//p[text()='Successfully Saved']");
    }
    public static By AssertSelectAdmin (String AssertElement){
        return By.xpath("(//div[text()=\""+AssertElement+"\"])[1]");
    }

    public AdminPage ClickOnAddButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddButton()));
        driver.findElement(AddButton()).click();
        return new AdminPage(driver);
    }
    public static By DeleteMassage(){
        return By.xpath("//p[text()='Successfully Deleted']");
    }
    public void DeleteAdmin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteButton));
        driver.findElement(DeleteButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AlertDelete));
        driver.findElement(AlertDelete).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteMassage()));

    }
    public void SearchAdmin(String UserName, String AssertAdmin){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameField));
        driver.findElement(UserNameField).sendKeys(UserName);
        driver.findElement(SearchButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AssertSelectAdmin(AssertAdmin)));
    }

}
