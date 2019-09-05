package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readAllDataFromExcelSheet {
	
	public static void main(String[] args) throws Exception {
		
		File scr=new File("C:\\\\Users\\\\USER\\\\Downloads\\\\Student data.xlsx");
		FileInputStream fs=new FileInputStream(scr);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Student data");
		
		int rowcount=sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) {
			int cellcount=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<cellcount; j++) {
				
				XSSFCell c1=sheet.getRow(i).getCell(j);
				System.out.println("Row="   +i+  "Colomb"   +j);
				c1.getStringCellValue();
				
				
			
			
			}}
		
	}

}
