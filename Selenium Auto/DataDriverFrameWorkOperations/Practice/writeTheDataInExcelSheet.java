package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeTheDataInExcelSheet {
	
	public static void main(String[] args) throws Exception {
		
	FileInputStream fs=new FileInputStream("C:\\\\Users\\\\USER\\\\Downloads\\\\Student data.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sheet=wb.getSheet("Student data");
	
	Cell c1=sheet.getRow(1).getCell(1);
	if(c1==null) {
		
		c1=sheet.getRow(1).createCell(1);
		c1.setCellValue("NewPassword");
		fs.close();
		
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\USER\\\\Downloads\\\\Student data.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
				
	}
	

}
}