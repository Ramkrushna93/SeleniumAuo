package BrowserSizeOperations;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetBrowserSizeInSelenium {
	
	@Test
	public void setSizeOfbrowser() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	driver.manage().window().setSize(new Dimension(500,500));

	

}
}