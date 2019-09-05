package TestNGMasterSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

}
