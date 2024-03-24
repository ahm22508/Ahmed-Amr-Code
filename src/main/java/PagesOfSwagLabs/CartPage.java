package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
   private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver =driver;

    }
    By RemoveButton = By.xpath("//button[text()= 'REMOVE']");
   private By ContinueShoppingButton= By.xpath("//a[text()='Continue Shopping']");
    By CheckoutButton= By.xpath("//a[text()= 'CHECKOUT']");

    public By GetContinueShoppingButton(){
        return ContinueShoppingButton;
    }


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
