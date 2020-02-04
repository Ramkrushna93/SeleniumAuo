package LinktestOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToRetriveLinknanmeWithOutSpace {
	    WebDriver driver;
		@BeforeMethod
		public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get("http://www.seleniumbymahesh.com/");
		}
		@Test
		public void operation() {
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			
			for(int i=0; i<=links.size(); i++) {
				
				if(!links.get(i).getText().isEmpty())
				
				System.out.println(links.get(i).getText());
				
			}
			
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}