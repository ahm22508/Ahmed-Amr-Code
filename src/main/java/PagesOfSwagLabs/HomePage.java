package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    String productName = "Sauce Labs Fleece Jacket";

    By link = By.xpath("//div[text()=\""+productName+"\"]");

    By header= By.id("header_container");

    public  void  OpenProduct(){

        driver.findElement(link).click();
    }
}

