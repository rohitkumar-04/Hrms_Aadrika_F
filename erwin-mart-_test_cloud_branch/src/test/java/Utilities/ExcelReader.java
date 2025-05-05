
package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

/*This class is created to read the input via Excel sheet.
The user has to open the Excel sheet TestDataInput and has to create the sheet name with the Test name*/
public class ExcelReader {

    @DataProvider(name="ExcelTestData")
    public String[][] getdata(Method method) throws IOException {
        String excelSheetName = method.getName();
        File f = new File(System.getProperty("user.dir")+"\\testdata\\TestDataInput.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheetname = wb.getSheet(excelSheetName);

        int totalRows = sheetname.getLastRowNum();
        Row rowcells =  sheetname.getRow(0);
        int totalCols =  rowcells.getLastCellNum();

        DataFormatter format = new DataFormatter();

        String testData[][] = new String[totalRows][totalCols];
        for (int i = 1; i<=totalRows;i++ )
        {   for(int j = 0;j<totalCols;j++)
        {
            testData[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
            System.out.println(testData[i-1][j]);
        }

        }
        return testData;

    }

}
