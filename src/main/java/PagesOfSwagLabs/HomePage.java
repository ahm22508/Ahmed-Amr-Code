package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    String productName = "Sauce Labs Fleece Jacket";

   public By link = By.xpath("//div[text()=\""+productName+"\"]");

    public By header= By.id("header_container");

    public void OpenProduct(){

        driver.findElement(link).click();
    }
}

