package PagesOfSwagLabs;

import org.openqa.selenium.By;


public class FinishPage {
    private final By Finish = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public By GetFinish(){
        return Finish;
        }
}
