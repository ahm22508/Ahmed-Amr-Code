package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.*;


public class BillPayTest extends Base {
    @DataProvider(name = "SQL")
    public String[][] ReadFromDataBaseSQL() throws SQLException{
        String Query = "Select * from login Limit 1 Offset 1";
        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatesting", "root", "aamrfou55@55");
        Statement Statement = Connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet result = Statement.executeQuery(Query);
        int Columns = result.getMetaData().getColumnCount();
        result.last();
        int Rows = result.getRow();
        result.beforeFirst();
        String [][] FinalResult = new String[Rows][Columns];
        int i = 0;
        while (result.next()){
            for (int Z = 0; Z<Columns; Z++){
                FinalResult[i][Z] = result.getString(Z+1);
            }
            i++;
        }
    return FinalResult;
    }

@Test(dataProvider = "SQL")
public void PayBills(String Name, String Address, String City, String State, String ZipCode, String Phone, String Account, String VerifyAccount, String Amount){
new LoginPage(driver).
        Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).
        ClickOnBillPay().BillPay(Name,Address, City, State, ZipCode, Phone, Account, VerifyAccount,Amount);
Assert.assertTrue(driver.findElement(FinishPage.PillPayComplete()).isDisplayed());
    }
}