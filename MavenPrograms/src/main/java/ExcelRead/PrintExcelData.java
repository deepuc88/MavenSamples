package ExcelRead;

import java.io.IOException;

public class PrintExcelData 
{
	public static void main(String[] args) throws IOException 
	{
		String s1 = ReadExcel.readString(0, 0);//reading value from 0th row, 0th cell
		String s2 = ReadExcel.readString(1, 0);
		System.out.print(s1);
		System.out.println(" : "+s2);
		String s3 = ReadExcel.readString(0, 1);
		System.out.print(s3);
		double i1 = ReadExcel.readNumeric(1, 1);
		System.out.println(" : "+i1);
	}
}
