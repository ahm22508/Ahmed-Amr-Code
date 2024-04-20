package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BillPayPage {
    private final WebDriver driver;
    public BillPayPage(WebDriver driver){
        this.driver = driver;
    }

    private  final By PayeeNameField = By.name("payee.name");
    private  final By AddressField = By.name("payee.address.street");
    private  final By CityField = By.name("payee.address.city");
    private  final By StateField = By.name("payee.address.state");
    private  final By ZipCodeField = By.name("payee.address.zipCode");
    private  final By PhoneField = By.name("payee.phoneNumber");
    private  final By AccountField = By.name("payee.accountNumber");
    private  final By VerifyAccountField = By.name("verifyAccount");
    private  final By AmountField = By.name("amount");
    private final By SendPaymentButton = By.xpath("//input[@value='Send Payment']");

    public void BillPay(String Name, String Address, String City, String State, String ZipCode, String Phone, String Account, String VerifyAccount, String Amount){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(PayeeNameField).sendKeys(Name);
        driver.findElement(AddressField).sendKeys(Address);
        driver.findElement(CityField).sendKeys(City);
        driver.findElement(StateField).sendKeys(State);
        driver.findElement(ZipCodeField).sendKeys(ZipCode);
        driver.findElement(PhoneField).sendKeys(Phone);
        driver.findElement(AccountField).sendKeys(Account);
        driver.findElement(VerifyAccountField).sendKeys(VerifyAccount);
        driver.findElement(AmountField).sendKeys(Amount);
        driver.findElement(SendPaymentButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.PillPayComplete()));
    }
}
