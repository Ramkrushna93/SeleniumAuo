package validateUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifytitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		String Title = driver.getTitle();

		if (Title.equalsIgnoreCase("Gmail")) {

			System.out.println("the test case is pass");

		} else {

			System.out.println("the test case is fail");
		}

	}
}
