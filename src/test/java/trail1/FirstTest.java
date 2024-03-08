package trail1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/index.html");
    }

    @AfterMethod
    public void End(){
        driver.quit();
    }
    String productName = "Sauce Labs Bolt T-Shirt";
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorButton = By.className("error-button");
    By headerArea = By.className("app_logo");
    By productLink = By.xpath("//div[text()='"+productName+"']");
    By prodcutPrice = By.className("inventory_details_price");
    By RemoveButton = By.xpath("//button[text()= 'REMOVE']");

    By cartButton = By.xpath("//button[@class= 'btn_primary btn_inventory']");    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String expectedPrice = "$15.99";
    String invalidUsername = "dwadaw";
    String invalidPassword = "dawdawfr";

    @Test
    public void validLogin(){
        driver.findElement(usernameField).sendKeys(validUsername);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginButton).click();
        boolean isHeaderDisplayed = driver.findElement(headerArea).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }

    @Test
    public void invalidLogin(){
        driver.findElement(usernameField).sendKeys(invalidUsername);
        driver.findElement(passwordField).sendKeys(invalidPassword);
        driver.findElement(loginButton).click();
        boolean isErrorDisplayed = driver.findElement(errorButton).isDisplayed();
        Assert.assertTrue(isErrorDisplayed);
    }

    @Test
    public void validateProductPrice(){
        driver.findElement(usernameField).sendKeys(validUsername);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginButton).click();
        driver.findElement(productLink).click();
        String actualValue = driver.findElement(prodcutPrice).getText();
        Assert.assertEquals(actualValue, expectedPrice);
    }
    @Test
    public void CartFunctionalityValidation(){
        driver.findElement(usernameField).sendKeys(validUsername);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginButton).click();
        driver.findElement(productLink).click();
        driver.findElement(cartButton).click();
        driver.findElement(RemoveButton).click();
    }
}