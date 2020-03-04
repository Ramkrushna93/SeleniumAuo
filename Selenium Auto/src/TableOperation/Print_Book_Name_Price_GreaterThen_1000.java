package TableOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_Book_Name_Price_GreaterThen_1000 {
	
	@Test
	public void printBookNamePriceGreaterThen1000() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		
		// Print book name whose price is greater than and equal to 1000
		
		
		WebElement table=driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));
	    List<WebElement> rows= driver.findElements(By.tagName("tr"));
		
	
	Thread.sleep(8000);
	for(int j=0; j<=rows.size(); j++) {
		
		WebElement pricecolmn=driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr["+j+"]/td[4]"));
		if(Integer.parseInt(pricecolmn.getText())>=1000) {
			
			WebElement bookname=driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr["+j+"]/td[1]"));
			System.out.println(bookname.getText());
			
		}

}}}
