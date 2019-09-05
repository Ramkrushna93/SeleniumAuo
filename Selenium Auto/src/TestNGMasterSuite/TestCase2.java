package TestNGMasterSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCase2 {
	
	@Test
	public static void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}

}
