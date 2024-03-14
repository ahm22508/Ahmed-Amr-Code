package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
            WebDriver driver;
    By AdminButton = By.xpath("//span[text()='Admin']");
  public   By CorrectLoginAssert = By.xpath("//*[text()='Bob Tester']");

    public void NavigateAdminButton(){
        driver.findElement(AdminButton).click();
    }
}
