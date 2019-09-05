package Excel_Reader;

import java.io.FileInputStream;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FillingCellColours {
	CellStyle style1,style2;
	@Test
	public void FillingColour() throws Exception {
		
		FileInputStream fs=new FileInputStream("C:\\ExcelData\\Test1.Excel.xlsx");
		XSSFWorkbook wd=new XSSFWorkbook(fs);
		Sheet st=wd.getSheet("WritingData");
		Row r=st.getRow(0);
		Cell c1=r.createCell(1);
		Cell c2=r.createCell(2);
		
		c1.setCellValue("Pass");
		c2.setCellValue("Fail");
		
	    style1=wd.createCellStyle();
		style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		c1.setCellStyle(style1);
		
	    style2=wd.createCellStyle();
		style2.setFillForegroundColor(IndexedColors.RED.getIndex());
		style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		c2.setCellStyle(style2);
		
		
		
		
	}

}
