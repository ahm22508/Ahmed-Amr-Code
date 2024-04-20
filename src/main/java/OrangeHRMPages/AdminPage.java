package OrangeHRMPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class AdminPage{
    private  final WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver = driver;
    }
    private final By AdminSelectOption = By.xpath("(//span[text()='Admin'])[2]");
    private  final By AdminDropDownMenu = By.xpath("(//div[text()='-- Select --'])[1]");
    private final By StatusSelectOption = By.xpath("//span[text()='Enabled']");
    private final By StatusDropDownMenu= By.xpath("//div[text()='-- Select --']");
    private final By EmployeeNameField=By.xpath("//input[@placeholder= 'Type for hints...']");
    private final By UserNameField=  By.xpath("(//input[@class= 'oxd-input oxd-input--active'])[2]");
    private final By ConfirmPasswordField = By.xpath("(//input[@type='password'])[2]");
    private final By PasswordField = By.xpath("(//input[@type='password'])[1]");
    private final By SaveButton = By.xpath("//button[text()=' Save ']");
    private final By EmployeeElement = By.xpath("//span[text()='yedghjb1 ru84 90jsnd']");


   public  void AddAdmin(String EmployeeHint, String USerName, String Password, String ConfirmPassword){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AdminDropDownMenu));
       driver.findElement(AdminDropDownMenu).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(AdminSelectOption));
       driver.findElement(AdminSelectOption).click();
       driver.findElement(EmployeeNameField).sendKeys(EmployeeHint);
       wait.until(ExpectedConditions.visibilityOfElementLocated(EmployeeElement));
       driver.findElement(EmployeeElement).click();
       driver.findElement(UserNameField).sendKeys(USerName);
       driver.findElement(PasswordField).sendKeys(Password);
       driver.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
       driver.findElement(StatusDropDownMenu).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(StatusDropDownMenu));
       driver.findElement(StatusSelectOption).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(SaveButton));
       driver.findElement(SaveButton).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(UserManagementPage.AssertAddAdmin()));
    }
}
