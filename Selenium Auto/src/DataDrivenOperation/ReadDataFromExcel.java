package DataDrivenOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\USER\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet st=wb.getSheet("Sheet1");
		
	    int allrows=st.getLastRowNum();
	    int coloum=st.getRow(allrows).getLastCellNum();
	    
	    for(int i=0 ;i<allrows ; i++) {
	    	
	    	XSSFRow rowvalue=st.getRow(i);
	    
	    
	    for(int j=0 ;j<coloum ;j++) {
	    	String value=rowvalue.getCell(j).toString();
	    
	    	System.out.print(" "+value);
	   
	    }
	    System.out.println("");
	}}

	
}
