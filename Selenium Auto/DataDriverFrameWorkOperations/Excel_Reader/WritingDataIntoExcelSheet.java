package Excel_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingDataIntoExcelSheet {

	@Test
	public void WritingData() throws Exception {

		FileInputStream fs = new FileInputStream("C:\\ExcelData\\Test1.Excel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheet("WritingData");
		Row r = sh.getRow(0);
		Cell c1 = r.createCell(0);
		Cell c2 = r.createCell(1);
		c1.setCellValue("Pass");
		c2.setCellValue("Fail");

		FileOutputStream fo = new FileOutputStream("C:\\ExcelData\\Test.Excel.xlsx");
		wb.write(fo);
		wb.close();
		fs.close();
		fo.close();

	}

}
