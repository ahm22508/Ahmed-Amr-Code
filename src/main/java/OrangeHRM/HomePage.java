package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
            WebDriver driver;
            public HomePage(WebDriver driver){
                this.driver = driver;
            }
   public By AdminButton = By.xpath("//span[text()='Admin']");
  public   By CorrectLoginAssert = By.xpath("//h6[text()='Dashboard']");

    public void NavigateAdminButton(){
        driver.findElement(AdminButton).click();
    }
}
