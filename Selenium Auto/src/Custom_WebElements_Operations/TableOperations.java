package Custom_WebElements_Operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableOperations {

	public WebDriver driver;

	@Test(enabled = false)
	public Integer get_Number_Of_Rows() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/java/custom-web-elements-selenium-webdriver");

		WebElement table = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div[1]/div[4]/table"));

		int rowcount = table.findElements(By.tagName("tr")).size() - 1;
		System.out.println("Total rows in a table " + rowcount);
		return rowcount;
	}

	@Test(enabled = false)
	public Integer get_Number_Of_Colombs() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/java/custom-web-elements-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement table1 = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div[1]/div[4]/table"));
		int colcount = table1.findElements(By.tagName("td")).size();
		System.out.println("Total cols in a table " + colcount);
		return colcount;

	}

	@Test(enabled=false)
	public void get_Table_Size() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/java/custom-web-elements-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement table = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div[1]/div[4]/table"));
		int rowcount = table.findElements(By.tagName("tr")).size() - 1;

		int colcount = table.findElements(By.tagName("td")).size();

		// Using HashMap
		Map<String, Integer> tablesize = new HashMap<>();

		tablesize.put("rows", rowcount);
		tablesize.put("colomns", colcount);

		System.out.println("Total size    " + tablesize);
	}
	
	@Test
	public void getAllData(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		// get number of rows
		WebElement table = driver.findElement(By.xpath("//table[@class=\"dataTable\"]"));
		int noOfRows = table.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr")).size() -1;
		
		// get number of columns
		int noOfColumns = table.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td")).size();
		List allData = new ArrayList<>();
		// iterate over the rows, to ignore the headers we have started the i with '1'
		for (int i = 2; i < noOfRows; i++) {
			// reset the row data every time
			List<String> ro = new ArrayList<>();
			// iterate over columns
			for (int j = 1; j < noOfColumns; j++) {
				// get text from the i th row and j th column
				ro.add(table.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			// add the row data to allData of the table
			allData.add(ro);
		}
		
		System.out.println(allData);
	}

}
