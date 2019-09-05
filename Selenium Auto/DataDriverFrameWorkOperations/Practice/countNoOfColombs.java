package Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class countNoOfColombs {
	
	public static void main(String[] args) {
		
		try {
		File scr=new File("C:\\Users\\USER\\Downloads\\Student data.xlsx");
		
		FileInputStream fs=new FileInputStream(scr);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Student data");
		XSSFRow rows=sheet.getRow(0);
		int totalColmbs=rows.getLastCellNum();
		System.out.println(totalColmbs);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
