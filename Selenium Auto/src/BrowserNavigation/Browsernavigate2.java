package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsernavigate2 {
	public static void main(String[] args)

	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.makemytrip.com");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
