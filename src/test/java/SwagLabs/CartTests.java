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
    String ProductName= "Sauce Labs Fleece Jacket";

    //Fluent Test Case Design.
    @Test
    public void CheckOutFunction(){
        new LoginPage(driver).Login(validUsername, validPassword).
                OpenProduct(ProductName).
                AddProductToCart()
                .ClickToCartImage()
                .ClickOnCheckoutButton().
                ClickToContinueButton(FirstName, LastName, PostalCode).
                ClickToFinishButton();
        boolean AssertMainFunction= driver.findElement(FinishPage.GetFinish()).isDisplayed();
        Assert.assertTrue(AssertMainFunction);
    }
}
