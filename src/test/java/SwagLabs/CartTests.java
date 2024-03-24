package SwagLabs;

import PagesOfSwagLabs.*;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";

    @Test
    public void CheckOutFunction(){
        LoginPage login =new LoginPage(driver);
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        CheckOutPage check = new CheckOutPage(driver);
        OverViewPage overview = new OverViewPage(driver);
        FinishPage finish = new FinishPage(driver);
        login.Login(validUsername, validPassword);
        home.OpenProduct();
        product.AddToCart();
        product.ClicktoCart();
        cart.Checkout();
        check.ClickToContinue();
        overview.ClickToFinishButton();
        boolean AssertMainFunction= driver.findElement(finish.GetFinish()).isDisplayed();
        Assert.assertTrue(AssertMainFunction);


    }
}
