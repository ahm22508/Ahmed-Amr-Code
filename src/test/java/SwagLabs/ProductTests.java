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

    @Test
    public void validateProductPrice() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct();
        ProductPage product = new ProductPage(driver);
        String ValidatePrice = driver.findElement(product.GetPrice()).getText();
        Assert.assertEquals(expectedPrice, ValidatePrice);
    }

    @Test
    public void AddToCartFunction() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct();
        ProductPage product = new ProductPage(driver);
        product.AddToCart();
        boolean AssertFunction = driver.findElement(product.GetRemoveButton()).isDisplayed();
        Assert.assertTrue(AssertFunction);
    }

    @Test
    public void filledCart() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct();
        ProductPage product = new ProductPage(driver);
        product.AddToCart();
        product.ClicktoCart();
        CartPage cart = new CartPage(driver);
        boolean AssertAdding = driver.findElement(cart.GetContinueShoppingButton()).isDisplayed();
        Assert.assertTrue(AssertAdding);
    }

    @Test
    public void Back() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct();
        ProductPage product = new ProductPage(driver);
        product.Back();
        boolean BackAssert = driver.findElement(home.GetLink()).isDisplayed();
        Assert.assertTrue(BackAssert);
    }
    @Test
    public void Remove(){
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.OpenProduct();
        ProductPage product = new ProductPage(driver);
        product.AddToCart();
        product.Remove();
        boolean AssertRemove = driver.findElement(product.GetCartButton()).isDisplayed();
        Assert.assertTrue(AssertRemove);
    }

}