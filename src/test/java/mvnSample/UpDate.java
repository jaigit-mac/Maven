package mvnSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpDate 
{
	public static void main(String[] args) throws Throwable 
	{
		File loc = new File("C:\\Users\\Jai\\eclipse-workspace\\mavenfirstproject\\Excel\\Sheet2.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet2");
		Row r = s.getRow(6);
		Cell c = r.getCell(4);
//		c.setCellValue("kumaran");
		String s1 = c.getStringCellValue();
		if(s1.equals("jai"))
		{
			c.setCellValue("vasantha");
		}
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
		System.out.println("updated successfully");
		
	}

}
