package OrangeHRM;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {
    WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver = driver;
    }
    By SearchArea = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By SearchButton = By.xpath("//button[@type='submit']");
    By AdminName = By.xpath("//div[text()='nalim']");

    public void SearchAdminName(String AdminName){
        driver.findElement(SearchArea).sendKeys(AdminName);
        driver.findElement(SearchButton).click();


    }
}
