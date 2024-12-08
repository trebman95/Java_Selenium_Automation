package basicJava;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFileData {
	public static void readexcel() throws Exception {
		File f = new File("C:\\Users\\trebm\\Desktop\\TestData\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("datasheet");
		
		int nr = sh1.getPhysicalNumberOfRows(); // 2 numbers of rows
		System.out.println(nr);	
		
		for(int i = 0; i < nr; i++) {
			XSSFRow row = sh1.getRow(i); // first row
			XSSFCell col = row.getCell(0);// first column
			System.out.println(col.getStringCellValue());
		}
		
		/*
		XSSFRow row1 = sh1.getRow(0); // first row
		XSSFCell col1 = row1.getCell(0);// first column
		System.out.println(col1.getStringCellValue());
		
		XSSFRow row2 = sh1.getRow(1); // second row
		XSSFCell col21 = row2.getCell(0);// first column
		System.out.println(col21.getStringCellValue());
		
		XSSFRow row12 = sh1.getRow(1); // second row
		XSSFCell col2 = row12.getCell(1);// second column
		System.out.println(col2.getStringCellValue());
		*/
			
	}
	
	public static void main(String[] args) throws Exception {
		readexcel();
	}
}
