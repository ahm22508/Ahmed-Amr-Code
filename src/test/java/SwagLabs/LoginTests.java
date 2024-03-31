package SwagLabs;

import PagesOfSwagLabs.HomePage;
import PagesOfSwagLabs.LoginPage;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginTests extends BaseTest {
@DataProvider(name = "LoginTestCase")
    public Object[][]ExtractFileExcel() throws IOException {
       File fileExcel = new File(System.getProperty("user.dir")+"\\TestData.xlsx");
        FileInputStream file = new FileInputStream(fileExcel);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Login");
        int NumRow = sheet.getLastRowNum();
        int NumCol= sheet.getRow(0).getLastCellNum();
        Object[][]ArrayFile = new Object[NumRow][NumCol];
        for(int r = 0; r < NumRow; r++){
            XSSFRow row = sheet.getRow(r+1);
            for (int c=0; c<NumCol; c++) {
                XSSFCell cell = row.getCell(c);
                CellType cellType = cell.getCellType();
                switch (cellType) {
                    case STRING:
                        ArrayFile[r][c] = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        ArrayFile[r][c] = Integer.toString((int) cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        ArrayFile[r][c] = cell.getBooleanCellValue();
                        break;
                }
            }
        }

return ArrayFile;
    }
    @Test(dataProvider = "LoginTestCase")
    public void validLogin(String UserName, String Password) {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        login.Login(UserName, Password);
        boolean AssertLogin = driver.findElement(home.GetHeader()).isDisplayed();
        Assert.assertTrue(AssertLogin);
    }
    }









