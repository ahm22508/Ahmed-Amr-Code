package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By header= By.id("header_container");

    public static By GetLink(String productName){
        return By.xpath("//div[text()=\""+productName+"\"]");
    }
    public By GetHeader(){
        return header;
    }

    public ProductPage OpenProduct(String ProductName){

        driver.findElement(By.xpath("//div[text()=\""+ProductName+"\"]")).click();
  return new ProductPage(driver);
    }
}

