package TestNGXmlSuite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test
	public static void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "httpa://www.google.com");
	}
}
