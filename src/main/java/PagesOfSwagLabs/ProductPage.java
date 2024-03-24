package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
   private WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    private final By price = By.className("inventory_details_price");
    private final By cartButton = By.xpath("//button[@class= 'btn_primary btn_inventory']");
    private final By addedCart= By.xpath("//*[@role='img']");
    private final By backButton= By.xpath("//button[text()= '<- Back']");
    private final By RemoveButton = By.xpath("//button[text()= 'REMOVE']");

    public By GetPrice(){
        return price;
    }
    public By GetRemoveButton(){
        return RemoveButton;
    }
    public By GetCartButton(){
        return cartButton;
    }


    public void AddToCart(){
        driver.findElement(cartButton).click();
    }
    public void ClicktoCart(){
        driver.findElement(addedCart).click();
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
