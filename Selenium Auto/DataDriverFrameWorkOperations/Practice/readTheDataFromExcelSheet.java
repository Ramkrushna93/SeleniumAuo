package Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readTheDataFromExcelSheet {
	
	public static void main(String[] args) {
		try {
		File scr=new File("C:\\Users\\USER\\Downloads\\Student data.xlsx");
		FileInputStream fs=new FileInputStream(scr);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Student data");
		String celldata=sheet.getRow(1).getCell(0).getStringCellValue();
	
		System.out.println(celldata);
		
		wb.close();
		fs.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}

}
