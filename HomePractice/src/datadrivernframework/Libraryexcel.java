package datadrivernframework;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Libraryexcel {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Libraryexcel(String filepath){
		try 
		{
			File src = new File(filepath);
		    fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} 
		 catch (Exception e)
		{
			
			System.out.println(e.getMessage());
		}
	}
	public String getdata(int sheetnumber, int row, int column)
	{
	    sheet = wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
