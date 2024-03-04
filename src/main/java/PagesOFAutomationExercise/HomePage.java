package PagesOFAutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By correctLogin= By.xpath("//button[@type='button']");
    By product = By.xpath("//a[@href='/product_details/19']");

    public void  ClickProduct(){
        driver.findElement(product).click();
    }
}
