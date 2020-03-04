package TableOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Find_Sum_Of_cust_All_Book_Listed {
	
	@Test
	public void findSumOfCustAllBookListed() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();;
		
		
		Thread.sleep(7000);
		List<WebElement> custColunms=driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr/td[4]"));
		
		int sum_price=0;
		for(WebElement e : custColunms) {
			
			sum_price=sum_price+Integer.parseInt(e.getText());
			
		}
		System.out.println("Total price is  "+sum_price);
		
		
		

}
}