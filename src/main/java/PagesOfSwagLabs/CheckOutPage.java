package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private final WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

   private final By FirstNameField = By.id("first-name");
   private final By LastNameField = By.id("last-name");
   private final By PostalCodeField = By.id("postal-code");
   private  final By ContinueButton = By.xpath("//input[@type='submit']");

   public OverViewPage ClickToContinueButton(String FirstName, String LastName, String PostalCode){
       driver.findElement(FirstNameField).sendKeys(FirstName);
       driver.findElement(LastNameField).sendKeys(LastName);
       driver.findElement(PostalCodeField).sendKeys(PostalCode);
       driver.findElement(ContinueButton).click();
       return new OverViewPage(driver);

   }
}
