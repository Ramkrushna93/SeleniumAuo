package DataDrivenOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		File scr=new File("C:\\Users\\USER\\Desktop\\Book1.xlsx");
		FileInputStream fs=new FileInputStream(scr);
		
		Workbook book=new XSSFWorkbook(fs);
		Sheet sheet=book.getSheetAt(0);
		
		sheet.getRow(1).createCell(5).setCellValue("Raju");
		sheet.getRow(2).createCell(5).setCellValue("pass");
//		
//		Cell c1, c2;
//		
//		c1=row.createCell(2);
//		c2=row.createCell(3);
//		
//		c1.setCellValue("Raju");
//		c2.setCellValue("Pass");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\USER\\Desktop\\Book1.xlsx");
		
		book.write(fos);
		
		
	
		
		
	}

}
