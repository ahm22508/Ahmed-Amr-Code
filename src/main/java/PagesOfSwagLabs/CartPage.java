package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
   private final WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver =driver;
    }

   private final By RemoveButton = By.xpath("//button[text()= 'REMOVE']");
   private final By ContinueShoppingButton= By.xpath("//a[text()='Continue Shopping']");
   private final By CheckoutButton= By.xpath("//a[text()= 'CHECKOUT']");

    public void  Remove(){
        driver.findElement(RemoveButton).click();
    }
        public void  ContinueShopping(){
        driver.findElement(ContinueShoppingButton).click();
    }
    public By GetContinueShoppingButton(){
        return ContinueShoppingButton;
    }

    public CheckOutPage ClickOnCheckoutButton(){
        driver.findElement(CheckoutButton).click();
        return new CheckOutPage(driver);
    }
}

