package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");

		String acturl = driver.getCurrentUrl();

		if (acturl.equalsIgnoreCase("https://www.google.com/intl/en-GB/gmail/about/#")) {

			System.out.println("The testcase is pass");

		} else {
			System.out.println("The testcase fail");

		}
	}

}
