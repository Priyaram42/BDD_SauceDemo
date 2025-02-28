package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

	public static Object[][] readData() {

		FileInputStream fis;
//XSSFRow row;
		XSSFCell cell;
		String[][] inputData = new String[3][2];
		String fileName = ".src\\test\\resources\\testdata\\InputData.xlsx";

		try {
			fis = new FileInputStream(fileName);

			XSSFWorkbook workbook = new XSSFWorkbook(fis); // XSSF -> xlsx- after 2013, xls - older version
			XSSFSheet sheet = workbook.getSheet("Input"); // workbook.getSheet("Sheet1")

			int rowCount = sheet.getLastRowNum();
			System.out.println("No of Rows: " + rowCount);

			DataFormatter df = new DataFormatter();

			for (int rowNo = 1; rowNo <= rowCount; rowNo++) { // i =1 means selection 2nd row in xl sheet

				int cellCount = sheet.getRow(rowNo).getLastCellNum(); // getting total no of cell in the row

				for (int cellNo = 0; cellNo < cellCount; cellNo++) { // this loop is to traverse each cell in row
					cell = sheet.getRow(rowNo).getCell(cellNo);
					inputData[rowNo - 1][cellNo] = df.formatCellValue(cell);
                  //inputData[rowNo - 1][cellNo] = sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
                 //System.out.print(inputData[rowNo - 1][cellNo] + "\t");
				}
				System.out.println();
			}
			workbook.close();

		} catch (FileNotFoundException fnf) {
			System.out.println("File name is not correct");
		} catch (IOException ioe) {
			System.out.println("Not able to read or write, pls check");
		}
		return inputData;
	}
}
