package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static String readString(int i, int j) throws IOException
	{
		f = new FileInputStream("C:\\Deepu\\Study\\Excel\\Employee.xlsx");
		wb = new XSSFWorkbook(f); //to get the excel work book
		//sh = wb.getSheet("Sheet1"); // to get the particular sheet in the excel work book.
		sh = wb.getSheetAt(0);
		Row r = sh.getRow(i); // to get the row in the excel sheet
		Cell c = r.getCell(j); // to get the cell in the row.
		return c.getStringCellValue(); // will return the value in the cell
	}

	public static double readNumeric(int i, int j) throws IOException 
	{
		f = new FileInputStream("C:\\Deepu\\Study\\Excel\\Employee.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getNumericCellValue();		
	}	
}
