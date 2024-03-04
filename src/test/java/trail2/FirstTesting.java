package trail2;

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


public class FirstTesting {

    WebDriver driver;
    @BeforeMethod
    public  void  Driver(){
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/login");

    }
    @AfterMethod
            public void Finish(){
        driver.quit();
    }
    By Email = By.xpath("//input[@data-qa='login-email']");
    By password = By.name("password");
    By login= By.xpath("//button[@type='submit' and text()='Login']");
    By correctLogin= By.xpath("//button[@type='button']");
    By incorrectogin=By.xpath("//p[text()='Your email or password is incorrect!']");
    By username= By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");

    By incorrectRegister = By.xpath("//p[text()='Email Address already exist!']");

    @Test
    public void Register(){
        driver.findElement(username).sendKeys("Ahmad Amr");
        driver.findElement(email).sendKeys("ahmadamr659@gmail.com");
        By register= By.xpath("//button[@type='submit' and text()='Signup']");
        driver.findElement(register).click();
        By MR= By.id("id_gender1");
        driver.findElement(MR).click();
        By pass=By.id("password");
        driver.findElement(pass).sendKeys("aamrfou55");
        By day=By.id("days");
        driver.findElement(day).sendKeys("23");
        By month=By.id("months");
        driver.findElement(month).sendKeys("June");
        By year=By.id("years");
        driver.findElement(year).sendKeys("1998");
        By FirstName=By.id("first_name");
        driver.findElement(FirstName).sendKeys("Ahmad");
        By LastName=By.id("last_name");
        driver.findElement(LastName).sendKeys("Amr");
        By company= By.id("company");
        driver.findElement(company).sendKeys("Vois");
        By address1 = By.id("address1");
        driver.findElement(address1).sendKeys("St.Shoubra");
        By address2 = By.id("address2");
        driver.findElement(address2).sendKeys("Cairo");
        By country = By.id("country");
        driver.findElement(country).sendKeys("U");
        driver.findElement(country).click();
        By state = By.id("state");
        driver.findElement(state).sendKeys("Cairo");
        By city = By.id("city");
        driver.findElement(city).sendKeys("Cairo");
        By zipcode = By.id("zipcode");
        driver.findElement(zipcode).sendKeys("59848");
        By mobile_number = By.id("mobile_number");
        driver.findElement(mobile_number).sendKeys("01554863523");
        By create= By.xpath("//button[@type='submit' and text()='Create Account']");
        driver.findElement(create).click();
        By following = By.xpath("//a[@href='/' and @ data-qa='continue-button']");
        driver.findElement(following).click();
        By correctregistration = By.xpath("//a[@href='/delete_account'] ");
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
@Test
    public void ValidLogin(){
        driver.findElement(Email).sendKeys("ahmadamr659@gmail.com");
        driver.findElement(password).sendKeys("aamrfou55");
        driver.findElement(login).click();
        boolean ValidLogin = driver.findElement(correctLogin).isDisplayed();
        Assert.assertTrue(ValidLogin);


    }
    @Test
    public void InValidLogin(){
        driver.findElement(Email).sendKeys("ahmadamr659@gmail.com");
        driver.findElement(password).sendKeys("aamrfo55");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait.. it applies on all elements and doesn't wait all the determined time but waits till all elements are visible only.
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
        waits.until(ExpectedConditions.elementToBeClickable(login)); //Explicit wait... it applies on one o specific element for the allocated time and till the determined condition gets true
        driver.findElement(login).click();
        boolean invalidlongin= driver.findElement(incorrectogin).isDisplayed();
        Assert.assertTrue(invalidlongin);
    }



}



