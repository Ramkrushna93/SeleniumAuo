package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateurl1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.irctc.com/displayServlet");

		String acturl = driver.getCurrentUrl();

		if (acturl.equalsIgnoreCase("http://www.irctc.com/displayServletgsew")) {

			System.out.println("The testcase is pass");
		} else {

			System.out.println("The testcase is fail");

			driver.close();

		}
	}

}
