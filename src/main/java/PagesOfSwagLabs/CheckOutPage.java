package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

   private By FirstNameField = By.id("first-name");
   private By LastNameField = By.id("last-name");
   private By PostalCodeField = By.id("postal-code");
   private  By ContinueButton = By.xpath("//input[@type='submit']");

   public void ClickToContinue(String FirstName, String LastName, String PostalCode){
       driver.findElement(FirstNameField).sendKeys(FirstName);
       driver.findElement(LastNameField).sendKeys(LastName);
       driver.findElement(PostalCodeField).sendKeys(PostalCode);
       driver.findElement(ContinueButton).click();
   }
}
