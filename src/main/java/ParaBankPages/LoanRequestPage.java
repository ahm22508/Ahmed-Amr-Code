package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoanRequestPage {
    private final WebDriver driver;
    public LoanRequestPage(WebDriver driver){
        this.driver = driver;
    }
    private final By AmountField = By.id("amount");
    private final By AmountDownField = By.id("downPayment");
    private final By IDAccountField = By.id("fromAccountId");
    private final By ApplyButton = By.xpath("//input[@value='Apply Now']");

    public void RequestLoan(String Amount, String AmountDown){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(AmountField).sendKeys(Amount);
        driver.findElement(AmountDownField).sendKeys(AmountDown);
        Select select = new Select(driver.findElement(IDAccountField));
        select.selectByIndex(3);
        driver.findElement(ApplyButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.LoanRequestApproved()));

    }
}
