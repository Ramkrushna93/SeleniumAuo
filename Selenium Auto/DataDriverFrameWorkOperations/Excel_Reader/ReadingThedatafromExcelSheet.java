package Excel_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingThedatafromExcelSheet {
	
	@Test
	public void ReadingExcelSheet() throws Exception {
		
	 FileInputStream fs=new FileInputStream("C:\\\\ExcelData\\\\Test.Excel.xlsx");
	 XSSFWorkbook wd=new XSSFWorkbook(fs);
	 Sheet sh=wd.getSheet("Selenium Sheet1");
	 Row r=sh.getRow(0);
	
	 Cell c1=r.getCell(0);
	 Cell c2=r.getCell(1);
	 Cell c3=r.getCell(2);
	 
	 String col1data=c1.getStringCellValue();
	 String col2data=c2.getStringCellValue();
	 String col3data=c3.getStringCellValue();
	 
	 System.out.println(col1data+" "+col2data+" "+col3data);
	 
	 
	 
	 
	 
	 
	 
	}

}
