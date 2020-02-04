package BrowserSizeOperations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserSizeInSelenium {

	@Test(enabled=false)
	public void maximizeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		Dimension dimension = driver.manage().window().getSize();

		System.out.println("Dimension of the window  "+dimension);

	}
	
	@Test
	public void measureAllSizeOfBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Dimension size=driver.manage().window().getSize();
		
		int hight=size.height;
		int width=size.width;
		int hight1=size.getHeight();
		int width1=size.getWidth();
		
		System.out.println("Hight of the browser  "+hight);
		System.out.println("Width of the browser  "+width);
		System.out.println("Hight1 of the browser  "+hight1);
		System.out.println("Width1 of the browser  "+width1);
		
	}
}