package Excel_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountNoOfRows {
	
	public static void main(String[] args) throws Exception  {
		
		
		FileInputStream fs=new FileInputStream("C:\\\\ExcelData\\\\Test.Excel.xlsx");
		try {
		Workbook wb=new XSSFWorkbook(fs);
		Sheet ws=wb.getSheet("Selenium Sheet1");
		int rc=ws.getLastRowNum();
		} catch(Exception e) {
			e.printStackTrace();
		
		
		}
		
	}

}
