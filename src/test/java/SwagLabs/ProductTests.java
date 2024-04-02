package SwagLabs;

import PagesOfSwagLabs.CartPage;
import PagesOfSwagLabs.HomePage;
import PagesOfSwagLabs.LoginPage;
import PagesOfSwagLabs.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {


    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String expectedPrice = "$49.99";
    String ProductName= "Sauce Labs Fleece Jacket";

    @Test
    public void validateProductPrice() {
        new LoginPage(driver).Login(validUsername, validPassword).OpenProduct(ProductName);
        String ValidatePrice = driver.findElement(ProductPage.GetPrice()).getText();
        Assert.assertEquals(expectedPrice, ValidatePrice);
    }

    @Test
    public void AddToCartFunction() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct(ProductName);
        ProductPage product = new ProductPage(driver);
        product.AddProductToCart();
        boolean AssertFunction = driver.findElement(product.GetRemoveButton()).isDisplayed();
        Assert.assertTrue(AssertFunction);
    }

    @Test
    public void filledCart() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct(ProductName);
        ProductPage product = new ProductPage(driver);
        product.AddProductToCart();
        product.ClickToCartImage();
        CartPage cart = new CartPage(driver);
        boolean AssertAdding = driver.findElement(cart.GetContinueShoppingButton()).isDisplayed();
        Assert.assertTrue(AssertAdding);
    }

    @Test
    public void Back() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct(ProductName);
        ProductPage product = new ProductPage(driver);
        product.Back();
        boolean BackAssert = driver.findElement(HomePage.GetLink(ProductName)).isDisplayed();
        Assert.assertTrue(BackAssert);
    }
    @Test
    public void Remove(){
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct(ProductName);
        ProductPage product = new ProductPage(driver);
        product.AddProductToCart();
        product.Remove();
        boolean AssertRemove = driver.findElement(product.GetCartButton()).isDisplayed();
        Assert.assertTrue(AssertRemove);
    }
}