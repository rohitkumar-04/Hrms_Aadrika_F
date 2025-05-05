package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/* This class is used to read Excel data.
 * The user has to create Test dataInput and has to create sheet name with the test name*/
public class ExcelReader {

	@DataProvider(name = "ExcelTestData")
	public String[][] getdata(Method method) throws IOException {

		String excelSheetName = method.getName();
		File f = new File(System.getProperty("user.dir") + "");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet(excelSheetName);

		int totalRows = sheetname.getLastRowNum();
		Row rowcells = sheetname.getRow(0);
		int totalCols = rowcells.getLastCellNum();

		DataFormatter format = new DataFormatter();

		String testData[][] = new String[totalRows][totalCols];
		for (int i = 1; i < totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				testData[i - 1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testData[i - 1][j]);
			}

		}

		return testData;

	}

	@DataProvider(name = "ExcelTestData")
	public static List<String[]> getExcelData(String filePath) {

		List<String[]> dataList = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream(filePath); Workbook wk = WorkbookFactory.create(fis)) {

			Sheet sh = wk.getSheetAt(0);
			int totalRows = sh.getPhysicalNumberOfRows();

			for (int r = 1; r < totalRows; r++) { // Skip header row (start from 1)
				Row row = sh.getRow(r);
				if (row == null)
					continue;

				int totalCols = row.getLastCellNum();
				String[] data = new String[totalCols];

				for (int c = 0; c < data.length; c++) {
					Cell cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					cell.setCellType(CellType.STRING);
					data[c] = cell.getStringCellValue().trim();
				}

				dataList.add(data);
				wk.close();
				fis.close();

			}

		} catch (Exception e) {
			System.out.println("Data is blank kindly check");
			e.printStackTrace();
		}

		return dataList;
	}

	@DataProvider(name = "ExcelTestData")
	public static String[] readData(String filePath) throws Exception {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wk = WorkbookFactory.create(fis);
		Sheet sh = wk.getSheetAt(0); // First Sheet

		Row rw = sh.getRow(1); // Read Second row (index 1), first is header
		int numCl = rw.getLastCellNum(); // Total cells in the row

		String[] testData = new String[numCl];

		for (int i = 0; i < testData.length; i++) {
			Cell cel = rw.getCell(i);

			if (cel != null) {
				cel.setCellType(CellType.STRING); // make sure every thing is String
				testData[i] = cel.getStringCellValue();
			} else {
				testData[i] = "";
			}
		}

		wk.close();
		fis.close();
		return testData;
	}
}
