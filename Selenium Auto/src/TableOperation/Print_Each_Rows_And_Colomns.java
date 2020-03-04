package TableOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_Each_Rows_And_Colomns {
	
	@Test
	public void printEachRowAndColomn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		
		WebElement table=driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));
	    List<WebElement> rows= driver.findElements(By.tagName("tr"));
		
	    Thread.sleep(9000);
	    
			WebElement authorname=table.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[3]/td[2]"));
			
			if(authorname.getText().toLowerCase().equalsIgnoreCase("Mukesh"))
			{
				
				WebElement booknamecol=table.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[3]/td[1]"));
				System.out.println(booknamecol.getText());
			}
			
			
			}
		}
	

