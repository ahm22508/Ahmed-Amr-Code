package PagesOFAutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    By quantity = By.id("quantity");
    By Cart = By.xpath("//button[@type='button']");
    By Shopping = By.xpath("//button[text()= 'Continue Shopping']");
    By viewCart = By.xpath("//*[text()='View Cart']");
    By logout = By.xpath("//a[text()=' Logout']");
    public void quant(String AddQuantity){
        driver.findElement(quantity).sendKeys(AddQuantity);
    }
    public void AddToCart(){
        driver.findElement(Cart).click();
    }
    public void ToShopping(){
        driver.findElement(Shopping).click();
    }
    public  void ToShowCart(){
        driver.findElement(viewCart).click();
    }
    public void logoutPage(){
        driver.findElement(logout).click();
    }


}


