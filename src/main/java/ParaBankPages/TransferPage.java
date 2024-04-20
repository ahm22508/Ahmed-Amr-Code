package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class TransferPage {
   private final WebDriver driver;
    public TransferPage(WebDriver driver){
        this.driver = driver;
    }
    private final By Amount = By.id("amount");
    private final By TransferButton = By.xpath("//input[@type='submit']");
    private final By IdAccount = By.id("fromAccountId");
    private final By ToIdAccount = By.id("toAccountId");


    public void TransferFunds(String Money){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Amount));
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(Amount)).click().sendKeys(Money).build().perform();
        Select select = new Select(driver.findElement(IdAccount));
        select.selectByIndex(0);
        Select select1 = new Select(driver.findElement(ToIdAccount));
        select1.selectByIndex(0);
        driver.findElement(Amount).sendKeys(Money);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(TransferButton));
        driver.findElement(TransferButton).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.TransferComplete()));

    }
}
