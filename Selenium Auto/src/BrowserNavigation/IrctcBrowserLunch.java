package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IrctcBrowserLunch {

	public static void main(String[] args)

	{

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#");

	}

}
