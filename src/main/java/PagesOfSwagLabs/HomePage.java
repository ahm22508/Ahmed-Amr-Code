package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    String productName = "Sauce Labs Fleece Jacket";

   private final By link = By.xpath("//div[text()=\""+productName+"\"]");

    private final By header= By.id("header_container");

    public By GetLink(){
        return link;
    }
    public By GetHeader(){
        return header;
    }

    public ProductPage OpenProduct(){

        driver.findElement(link).click();
  return new ProductPage(driver);
    }
}

