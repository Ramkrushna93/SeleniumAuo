package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test(priority=0,description="the method is execuiting")
	public  void lunchBrowser()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	}
	@Test(priority=1,description="the method is execuiting")
	public void lunchApplication()
	{
		
	}
	
	
	
	
	
	

}
