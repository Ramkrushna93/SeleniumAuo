package Practice5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableOperation1 {
	
	WebDriver driver;
	List<WebElement> rows;
	List<WebElement> cols;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
	}
	@Test(priority=2)
	public void tableOperation() {
		WebElement table=driver.findElement(By.cssSelector("table[class=\"dataTable\"]"));
		 rows=table.findElements(By.tagName("tr"));
		System.out.println("The total rows in this table="+rows.size());
		
		 cols=table.findElements(By.tagName("td"));
		System.out.println("Total colombs in this table= "+cols.size());
		
		for(int i=0; i<rows.size(); i++) {
			String rowsvaluename=rows.get(i).getText();
			System.out.println(rowsvaluename);
		
			if (rowsvaluename.contains("Tata Motors Ltd.")) {
				WebElement click=rows.get(i);
				click.click();
			}
			
		}}
	
//		@Test(priority=1)
//		public void printAllvalue() {
//			
//			WebElement table=driver.findElement(By.cssSelector("table[class=\"dataTable\"]"));
//			List<WebElement> allrows=table.findElements(By.tagName("tr"));
//			System.out.println(allrows.size());
//			for(int i=0; i<allrows.size(); i++) {
//				String rows1name=allrows.get(i).findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+(i+1)+"]/td[1]/a")).getText();
//				System.out.println(rows1name);
//		
//			}	
//		}
//		
	}
	


