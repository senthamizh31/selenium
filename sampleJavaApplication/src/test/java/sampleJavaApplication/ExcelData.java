package sampleJavaApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		
		//XSSFWorkbook workbook = new XSSFWorkbook("D:\\senthamizh\\Sample.xlsx");
		//XSSFSheet worksheet = workbook.getSheet("Sheet1");
		//System.out.println(worksheet.getPhysicalNumberOfRows());
		//workbook.close();
		FileInputStream file = new FileInputStream(new File("D:\\senthamizh\\Sample.xlsx"));
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet worksheet = workbook.getSheet("Sheet1");
		
		
		System.out.println(worksheet.getRow(1).getCell(1).getStringCellValue());
		
		workbook.close();

	}

}
