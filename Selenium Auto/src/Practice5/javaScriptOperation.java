package Practice5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class javaScriptOperation {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		}
	@Test
	public void facebookOperation() throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('email').value=''");
		
		js.executeScript("document.getElementById('pass').value=''");
		js.executeScript("document.querySelector(\"input[type='submit']\").click()");
		
		
		}
	
	

}
