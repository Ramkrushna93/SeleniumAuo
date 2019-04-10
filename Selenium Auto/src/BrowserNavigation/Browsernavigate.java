package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigate {

	public static void main(String[] args)

	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.navigate().to("https://www.snapdeal.com/");

		driver.navigate().back();
		driver.quit();

	}
}