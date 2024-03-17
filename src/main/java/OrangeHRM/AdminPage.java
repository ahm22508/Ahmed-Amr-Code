package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver = driver;
    }
 public    By SearchArea = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
  public   By SearchButton = By.xpath("//button[@type='submit']");
  public   By AdminName = By.xpath("//div[text()='Ali_Rahman']");
   public By AssertToAdminPage = By.xpath("//button[text()=' Add ']");

    public void SearchAdminName(String AdminName){
        driver.findElement(SearchArea).sendKeys(AdminName);
        driver.findElement(SearchButton).click();


    }
}
