package browserLunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service");
		driver.navigate().to("https://facebook.com");

		driver.navigate().back();
		Thread.sleep(4000);

		driver.navigate().refresh();
		driver.close();
	}

}
