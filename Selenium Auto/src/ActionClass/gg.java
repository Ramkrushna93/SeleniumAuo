package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gg {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println("the title of the page is " + driver.getTitle());
	}

	@AfterMethod
	public void close() {
		driver.quit();

	}

}
