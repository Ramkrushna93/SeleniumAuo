package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigate3 {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/arg0");
		driver.navigate().to("https://gaana.com/");
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		driver.quit();

	}
}
