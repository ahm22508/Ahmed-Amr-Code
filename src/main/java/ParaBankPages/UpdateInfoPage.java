package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateInfoPage {
    private final WebDriver driver;

    public UpdateInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By FirstNameField = By.id("customer.firstName");
    private final By LastNameField = By.id("customer.lastName");
    private final By AddressField = By.id("customer.address.street");
    private final By CityField = By.id("customer.address.city");
    private final By StateField = By.id("customer.address.state");
    private final By ZipCodeField = By.id("customer.address.zipCode");
    private final By PhoneNumberField = By.id("customer.phoneNumber");
    private final By UpdateDateInfo = By.xpath("//input[@type='submit']");

    public void UpdateInfo(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String PhoneNumber ) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(FirstNameField).sendKeys(FirstName);
        driver.findElement(LastNameField).sendKeys(LastName);
        driver.findElement(AddressField).sendKeys(Address);
        driver.findElement(CityField).sendKeys(City);
        driver.findElement(StateField).sendKeys(State);
        driver.findElement(ZipCodeField).sendKeys(ZipCode);
        driver.findElement(PhoneNumberField).sendKeys(PhoneNumber);
        driver.findElement(UpdateDateInfo).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.UpdateInfoCompleted()));
    }
}
