package Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class printThevalueOfTheCellInRow1 {
	
   public static void main(String[] args) {
	   
	   try {
		   
	   File scr=new File("C:\\Users\\USER\\Downloads\\Student data.xlsx");
	   
	   FileInputStream fs=new FileInputStream(scr);
	   XSSFWorkbook wb=new XSSFWorkbook(fs);
	   XSSFSheet sheet=wb.getSheet("Student data");
	   int cellcount=sheet.getRow(1).getLastCellNum();
	   
	   for(int i=0; i<=cellcount; i++) {
		   
		  String cellvalue=sheet.getRow(3).getCell(i).toString();
	
		    System.out.println(cellvalue);
	   }
	   
	   wb.close();
	   fs.close();
	 
	   } catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   }
  
   }
 
   
