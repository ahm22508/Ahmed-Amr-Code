package PagesOfSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {
    private WebDriver driver;
    public FinishPage(WebDriver driver){
        this.driver = driver;
    }
    private By Finish = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public By GetFinish(){
        return Finish;
    }
}
