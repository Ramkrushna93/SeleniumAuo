package Practice4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksOperation {
	
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
	}
	@Test
	public void linkOperation() throws InterruptedException {
	List<WebElement> links=driver.findElements(By.tagName("a"));

	System.out.println(links.size());
	for(int i=0; i<links.size();i++) {
		
	String linksurl=links.get(i).getAttribute("href");
	 System.out.println(linksurl);
	 Thread.sleep(3000);
	driver.navigate().to(linksurl);
    driver.navigate().back();
			
		}}
			
		
	
	
	
	}
	
	


