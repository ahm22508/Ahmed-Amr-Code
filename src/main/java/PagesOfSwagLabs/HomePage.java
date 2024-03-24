package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    String productName = "Sauce Labs Fleece Jacket";

   private By link = By.xpath("//div[text()=\""+productName+"\"]");

    private By header= By.id("header_container");

    public By GetLink(){
        return link;
    }
    public By GetHeader(){
        return header;
    }

    public void OpenProduct(){

        driver.findElement(link).click();
    }
}

