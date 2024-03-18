package AutomationExercise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends Base {
    By MR= By.id("id_gender1");
    By pass=By.id("password");
    By day=By.id("days");
    By month=By.id("months");
    By year=By.id("years");
    By FirstName=By.id("first_name");
    By LastName=By.id("last_name");
    By company= By.id("company");
    By address1 = By.id("address1");
    By address2 = By.id("address2");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobile_number = By.id("mobile_number");
    By create= By.xpath("//button[@type='submit' and text()='Create Account']");
    By following = By.xpath("//a[@href='/' and @ data-qa='continue-button']");
    By correctregistration = By.xpath("//a[@href='/delete_account'] ");
    By incorrectRegister = By.xpath("//p[text()='Email Address already exist!']");
    By username= By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");
    By register= By.xpath("//button[@type='submit' and text()='Signup']");
@Test
    public void Register(){
        driver.findElement(username).sendKeys("Ahmad Amr");
        driver.findElement(email).sendKeys("ahmadamr659@gmail.com");
        driver.findElement(register).click();
        driver.findElement(MR).click();
        driver.findElement(pass).sendKeys("aamrfou55");
        driver.findElement(day).sendKeys("23");
        driver.findElement(month).sendKeys("June");
        driver.findElement(year).sendKeys("1998");
        driver.findElement(FirstName).sendKeys("Ahmad");
        driver.findElement(LastName).sendKeys("Amr");
        driver.findElement(company).sendKeys("Vois");
        driver.findElement(address1).sendKeys("St.Shoubra");
        driver.findElement(address2).sendKeys("Cairo");
        driver.findElement(country).sendKeys("U");
        driver.findElement(country).click();
        driver.findElement(state).sendKeys("Cairo");
        driver.findElement(city).sendKeys("Cairo");
        driver.findElement(zipcode).sendKeys("59848");
        driver.findElement(mobile_number).sendKeys("01554863523");
        driver.findElement(create).click();
        driver.findElement(following).click();
        boolean validregistration = driver.findElement(correctregistration).isDisplayed();
        Assert.assertTrue(validregistration);

    }
    @Test
    public void incorrectRegister(){
        driver.findElement(username).sendKeys("Ahmad Amr");
        driver.findElement(email).sendKeys("ahmadamr659@gmail.com");
        By register= By.xpath("//button[@type='submit' and text()='Signup']");
        driver.findElement(register).click();
        boolean invalidregister= driver.findElement(incorrectRegister).isDisplayed();
        Assert.assertTrue(invalidregister);

    }
}
