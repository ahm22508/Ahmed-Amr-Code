package SwagLabs;

import PagesOfSwagLabs.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String FirstName = "Ahmed";
    String LastName = "Amr";
    String PostalCode = "55839";

    @Test
    public void CheckOutFunction(){
        LoginPage login =new LoginPage(driver);
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        CheckOutPage checkout = new CheckOutPage(driver);
        OverViewPage overview = new OverViewPage(driver);
        FinishPage finish = new FinishPage();
        login.Login(validUsername, validPassword);
        home.OpenProduct();
        product.AddToCart();
        product.ClickToCart();
        cart.Checkout();
        checkout.ClickToContinue(FirstName, LastName, PostalCode);
        overview.ClickToFinishButton();
        boolean AssertMainFunction= driver.findElement(finish.GetFinish()).isDisplayed();
        Assert.assertTrue(AssertMainFunction);
    }
}
