package mvnSample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write 
{
	public static void main(String[] args) throws Throwable 
	{
		File loc = new File("C:\\Users\\Jai\\eclipse-workspace\\mavenfirstproject\\Excel\\Sheet2.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet2");
		Row r = s.createRow(6);
		Cell c = r.createCell(4);
		c.setCellValue("jaikumar");
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
		System.out.println("wrote successfully");	
	}

}
