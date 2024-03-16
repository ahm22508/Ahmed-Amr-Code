package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public   By price = By.className("inventory_details_price");
    public By cartButton = By.xpath("//button[@class= 'btn_primary btn_inventory']");
    public By addedCart= By.xpath("//*[@role='img']");
    public By backButton= By.xpath("//button[text()= '<- Back']");
    public By RemoveButton = By.xpath("//button[text()= 'REMOVE']");


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
