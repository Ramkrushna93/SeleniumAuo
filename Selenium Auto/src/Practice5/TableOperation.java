package Practice5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TableOperation {
	WebDriver driver= null;
	@BeforeSuite
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	@BeforeClass
	public void urllunch() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/WebTable.html");
	}
	
	@Test
	public void tableOperation() {
		
	}
	

}
