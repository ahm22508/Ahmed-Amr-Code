package PagesOfSwagLabs;

import org.openqa.selenium.By;


public class FinishPage {
    private static final By Finish = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public static By GetFinish(){
        return Finish;
        }
}
