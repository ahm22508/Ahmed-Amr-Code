package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By RemoveButton = By.xpath("//button[text()= 'REMOVE']");
    By ContinueShoppingButton= By.xpath("//a[text()='Continue Shopping']");
    By CheckoutButton= By.xpath("//a[text()= 'CHECKOUT']");


    public void  Remove(){
        driver.findElement(RemoveButton).click();

    }
    public void  ContinueShopping(){
        driver.findElement(ContinueShoppingButton).click();

    }
    public void  Checkout(){
        driver.findElement(CheckoutButton).click();

    }


}
