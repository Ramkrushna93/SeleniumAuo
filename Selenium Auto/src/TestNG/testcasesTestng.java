package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcasesTestng {
	 WebDriver driver;
		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		    driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		    driver.get("https://www.seleniumhq.org/");
		}
		
		@Test(priority=1)
		public void tootipsOperations() {
		    WebElement tooltips=driver.findElement(By.xpath("(//a[contains(text(),'Download')])[1]"));
		    String tooltipstitle=tooltips.getAttribute("title");
		    System.out.println(tooltipstitle);
		    Assert.assertEquals(tooltipstitle,"Get Selenium");
		
		}
		
		@Test(priority=2)
		public void validateTitle() {
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Selenium - Web Browser Automation");
		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
		
}
