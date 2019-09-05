package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class countNoOfRows {
	
	public static void main(String[] args)  {
		
		try {
		File scr=new File("C:\\\\Users\\\\USER\\\\Downloads\\\\Student data.xlsx");

		FileInputStream fs=new FileInputStream(scr);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Student data");
		int totalrows=sheet.getLastRowNum();
		System.out.println(totalrows);
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	}

}
