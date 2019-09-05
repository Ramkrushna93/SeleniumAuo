package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validatetitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		String acttitle = driver.getTitle();

		if (acttitle.equalsIgnoreCase("Facebook – log in or sign up")) {

			System.out.println("The testcase is pass");
		} else {

			System.out.println("The testcase is fail");

		}
		driver.close();
	}

}
