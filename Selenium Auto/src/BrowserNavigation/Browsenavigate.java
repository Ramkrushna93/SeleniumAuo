package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsenavigate {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/arg0");
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#arg0");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
