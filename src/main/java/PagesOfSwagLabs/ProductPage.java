package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
   private final WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    private static final By price = By.className("inventory_details_price");
    private final By cartButton = By.xpath("//button[@class= 'btn_primary btn_inventory']");
    private final By addedCart= By.xpath("//*[@role='img']");
    private final By backButton= By.xpath("//button[text()= '<- Back']");
    private final By RemoveButton = By.xpath("//button[text()= 'REMOVE']");

    public static By GetPrice(){
        return price;
    }
    public By GetRemoveButton(){
        return RemoveButton;
    }
    public By GetCartButton(){
        return cartButton;
    }


    public ProductPage AddProductToCart(){
        driver.findElement(cartButton).click();
        return this;
    }
    public CartPage ClickToCartImage(){
        driver.findElement(addedCart).click();
        return new CartPage(driver);

    }
    public void Back(){
        driver.findElement(backButton).click();
    }
    public void Remove(){
        driver.findElement(RemoveButton).click();
    }

    public void CartFunctionalityValidation(){
        driver.findElement(cartButton).click();
        driver.findElement(RemoveButton).click();
    }
}
