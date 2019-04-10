package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsernavigate4 {

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.cleartrip.com/");

		driver.navigate().to("http://www.irctc.com/displayServlet");
		Thread.sleep(5000);

		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		/*
		 * Thread.sleep(5000);
		 * 
		 * driver.navigate().forward(); Thread.sleep(5000);
		 * 
		 * driver.close();
		 */

	}

}
