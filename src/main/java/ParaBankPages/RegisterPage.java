package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegisterPage {
    private final WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    private final By FirstNameField = By.id("customer.firstName");
    private final By LastNameField = By.id("customer.lastName");
    private final By AddressField = By.id("customer.address.street");
    private final By CityField = By.id("customer.address.city");
    private final By StateField = By.id("customer.address.state");
    private final By ZipCodeField = By.id("customer.address.zipCode");
    private final By PhoneNumberField = By.id("customer.phoneNumber");
    private final By SSNField = By.id("customer.ssn");
    private final By UserNameField = By.id("customer.username");
    private final By PasswordField = By.id("customer.password");
    private final By ConfirmPasswordField = By.id("repeatedPassword");
    private final By RegisterButton = By.xpath("//input[@value ='Register']");

    public static By AssertErrorRegister(){
        return By.xpath("//span[@class ='error']");
    }

    public void RegisterToSite(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String PhoneNumber, String SSN, String UserName, String Password, String ConfirmPassword) {
        driver.findElement(FirstNameField).sendKeys(FirstName);
        driver.findElement(LastNameField).sendKeys(LastName);
        driver.findElement(AddressField).sendKeys(Address);
        driver.findElement(CityField).sendKeys(City);
        driver.findElement(StateField).sendKeys(State);
        driver.findElement(ZipCodeField).sendKeys(ZipCode);
        driver.findElement(PhoneNumberField).sendKeys(PhoneNumber);
        driver.findElement(SSNField).sendKeys(SSN);
        driver.findElement(UserNameField).sendKeys(UserName);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
        driver.findElement(RegisterButton).click();
    }
}
