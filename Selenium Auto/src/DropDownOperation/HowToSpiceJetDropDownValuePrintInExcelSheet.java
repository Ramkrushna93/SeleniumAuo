package DropDownOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToSpiceJetDropDownValuePrintInExcelSheet {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver (1).exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com");
	}

	@Test
	public void printAllValueInExcelSheet() throws InterruptedException {
		
		WebElement clicktextbox=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		clicktextbox.click();
		
		List<WebElement> alllist=clicktextbox.findElements(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul/li/a"));
		System.out.println(alllist.size());
		
		for(int i=0; i<alllist.size(); i++) {
			
		String allvaluename=alllist.get(i).getText();
		System.out.println(allvaluename);
		Thread.sleep(3000);
		setExcelData("G:\\\\Book1.xlsx", "Dropdownvalue", i, 0, allvaluename);
		}}
	
		public static void setExcelData(String filepath, String sheetname, int rowindex, int cellindex, String data )
		{
		try {
		FileInputStream fs=new FileInputStream(filepath);
		Workbook book=new WorkbookFactory().create(fs);
		Sheet sheet=book.getSheet(sheetname);
		Thread.sleep(3000);
		Row r=sheet.createRow(rowindex);
		Cell c=r.createCell(cellindex);
		c.setCellValue(data);
		
		FileOutputStream fo=new FileOutputStream(filepath);
		book.write(fo);
		
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

	