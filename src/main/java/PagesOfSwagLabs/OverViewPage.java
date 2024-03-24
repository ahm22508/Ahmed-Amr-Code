package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage {
  private   WebDriver driver;
    public OverViewPage(WebDriver driver){
        this.driver = driver;
    }
    By FinishButton = By.xpath("//a[text()='FINISH']");

    public void ClickToFinishButton(){
        driver.findElement(FinishButton).click();
    }

}
