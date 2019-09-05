package Excel_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class CountsNoOfCollmbs {
	
	@Test
	public void NoOfCollmbs() throws Exception {
		File scr=new File("C:\\ExcelData\\Test.Excel.xlsx");
		FileInputStream fs=new FileInputStream(scr);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		Sheet ws=wb.getSheet("Selenium Sheet1");
		Row r=ws.getRow(0);
		int c=r.getLastCellNum();
		System.out.println(c);
		
	}

}
