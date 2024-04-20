package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By TransferFunds = By.xpath("//a[text()='Transfer Funds']");
    private final By BillPay = By.xpath("//a[text()='Bill Pay']");
    private final By UpdateInfo = By.xpath("//a[text()='Update Contact Info']");
    private final By RequestLoan = By.xpath("//a[text()='Request Loan']");
    public static By OpenNewAccount(){
        return By.xpath("//a[text()='Open New Account']");
    }

    public NewAccountPage ClickOnOpenNewAccount(){
        driver.findElement(HomePage.OpenNewAccount()).click();
    return new NewAccountPage(driver);
    }
    public  TransferPage ClickOnTransferFunds(){
        driver.findElement(TransferFunds).click();
     return new TransferPage(driver);
    }

    public BillPayPage ClickOnBillPay(){
        driver.findElement(BillPay).click();
     return new BillPayPage(driver);
    }
    public UpdateInfoPage ClickOnUpdateInfo(){
        driver.findElement(UpdateInfo).click();
        return new UpdateInfoPage(driver);
    }
    public LoanRequestPage RequestLoan(){
        driver.findElement(RequestLoan).click();
    return new LoanRequestPage(driver);
    }



}

