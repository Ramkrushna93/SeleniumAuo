package TableOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_Last_Row_Of_Table {
	
	@Test
	public void printLastRowOfTable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		
		System.out.println("Print last row of table");
		
		List<WebElement> colonmoflastrow=driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[last()]/td"));
		for(WebElement e :colonmoflastrow) {
			
			System.out.println(e.getText());
		}
		
		
		

}
}