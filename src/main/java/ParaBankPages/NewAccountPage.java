package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class NewAccountPage {
    private final WebDriver driver;
    public NewAccountPage(WebDriver driver){
        this.driver = driver;
    }
    private final By OpenNewAccountButton = By.xpath("//input[@type='submit']");
    private final By SavingSelection = By.id("type");
    private final By IdAccount = By.id("fromAccountId");

    public void OpenNewAccount(){
        Select select = new Select(driver.findElement(SavingSelection));
        select.selectByIndex(1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(IdAccount));
        Select select1 = new Select(driver.findElement(IdAccount));
        select1.selectByIndex(2);
        driver.findElement(OpenNewAccountButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.GetAccountOpened()));
    }
}
