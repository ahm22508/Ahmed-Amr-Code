package trail1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {


        String productName = "Sauce Labs Bolt T-Shirt";
        By usernameField = By.id("user-name");
        By passwordField = By.id("password");
        By loginButton = By.id("login-button");
        By productLink = By.xpath("//div[text()=\""+productName+"\"]");
        By productPrice = By.className("inventory_details_price");

        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        String expectedPrice = "$15.99";

        @Test
        public void validateProductPrice(){
            driver.findElement(usernameField).sendKeys(validUsername);
            driver.findElement(passwordField).sendKeys(validPassword);
            driver.findElement(loginButton).click();
            driver.findElement(productLink).click();
            String actualValue = driver.findElement(productPrice).getText();
            Assert.assertEquals(actualValue, expectedPrice);
        }


    }