package mvnSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass 
{
	public static String getData(int rowNo,int cellNo) throws Throwable
	{
		String Value=null;
		File loc = new File("C:\\Users\\Jai\\eclipse-workspace\\mavenfirstproject\\Excel\\Sheet1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
	    Cell c = r.getCell(cellNo);
	    int Type = c.getCellType();
	    if(Type==1)
	    {
	    	Value=c.getStringCellValue();
	    }
	    else if(Type==0)
	    {
	    	if(DateUtil.isCellDateFormatted(c))
	    	{
	    		Date date = c.getDateCellValue();
	    		SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/yyyy");
	    		 Value= sim.format(date);
	    	}
	    	else
	    	{
	    		double numeric = c.getNumericCellValue();
	    		long l = (long)numeric;
	    		Value= String.valueOf(l);
	    	}
	    }
	    return Value;
	}

}
