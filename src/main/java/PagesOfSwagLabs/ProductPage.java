package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    By price = By.className("inventory_details_price");
    By cartButton = By.xpath("//button[@class= 'btn_primary btn_inventory']");
    By addedCart= By.xpath("//*[@role='img']");
    By backButton= By.xpath("//button[text()= '<- Back']");
    By RemoveButton = By.xpath("//button[text()= 'REMOVE']");

    public void AddToCart(){
        driver.findElement(cartButton).click();
    }
    public void  ClicktoCart(){
        driver.findElement(addedCart).click();
    }
    public void Back(){
        driver.findElement(backButton).click();
    }

    public void Remove(){
        driver.findElement(RemoveButton).click();
    }


}
