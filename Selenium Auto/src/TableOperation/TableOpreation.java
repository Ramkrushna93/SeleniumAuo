package TableOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOpreation {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/#");
		
		WebElement table=driver.findElement(By.xpath("//*[@id=\"content\"]/table"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(int i=0; i<rows.size();i++) {
			
			String rowData=rows.get(i).findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+(i+1)+"]/td[2]")).getText();
			
			System.out.println("the value of row data"+rowData);
			if (rowData.contains("Shanghai"))
			{
				
				String country=rows.get(i).findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+(i+1)+"]/td[1]")).getText();
			System.out.println("The country name is"+country);
			if (country.contains("China")) {                       
				System.out.println("The country1 name is"+country);				
				}
				else 	
				{
					System.out.println("The rowData1 name is"+rowData);
					
				}
				
			}
			
		}
	}}


