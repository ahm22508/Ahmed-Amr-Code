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

   public void ClickToContinue(){
       driver.findElement(FirstNameField).sendKeys("Ahmed");
       driver.findElement(LastNameField).sendKeys("Amr");
       driver.findElement(PostalCodeField).sendKeys("4i495");
       driver.findElement(ContinueButton).click();
   }




}
