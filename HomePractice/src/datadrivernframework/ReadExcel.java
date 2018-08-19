package datadrivernframework;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

public static void main(String []args) throws Exception
{
	File src = new File("C:\\Users\\Jatt\\Desktop\\SampleTest.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int total_rows = sheet1.getLastRowNum();
	System.out.println("Total number of rows are :"+total_rows);
	for (int i=0; i<=total_rows;i++)
	{
		System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(i).getCell(1).getStringCellValue());
	}
	wb.close();
	
}
	
}
	


