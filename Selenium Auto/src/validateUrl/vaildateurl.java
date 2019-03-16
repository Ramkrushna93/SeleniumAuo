package validateUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vaildateurl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		String actUrl = driver.getCurrentUrl();

		if (actUrl.equalsIgnoreCase("https://www.facebook.com/")) {
			System.out.println("The test case is pass");

		} else {

			System.out.println("The test case is fail");
		}
	}

}
