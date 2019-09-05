package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testngParameterisedOperation {
	
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
			driver=new ChromeDriver();
			
		} if(browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\lib\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
			
		} else {
			System.out.println("Browser is not found");
		}
		driver.get("https://www.facebook.com/");
		
	}
	@Parameters({"username","pwd"})
	@Test
	public void loginOperation(String username , String pwd) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		
		
	}

}
