package ParaBankPages;

import org.openqa.selenium.By;

public class FinishPage {

    public static By GetAccountOpened(){
      return By.xpath("//h1[text()= 'Account Opened!']");
    }
    public static By TransferComplete() {
      return   By.xpath("//h1[text()='Transfer Complete!']");
    }
    public static By PillPayComplete(){
        return By.xpath("//h1[text()='Bill Payment Complete']");
    }
    public static By UpdateInfoCompleted(){
        return By.xpath("//h1[text()='Profile Updated']");
    }
    public static By LoanRequestApproved(){
        return By.xpath("//td[text()='Approved']");
    }
    public static By UpdatePageError(){return By.xpath("//span[text()='First name is required.']");}
}
