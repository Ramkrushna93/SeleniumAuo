package LinktestOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktestOperation1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();

		String Title = driver.getTitle();
		System.out.println(Title);

		if (driver.getTitle().equalsIgnoreCase("Google Images")) {

			System.out.println("The testcase is Pass");

		} else {

			System.out.println("The testcase is Fail");
		}

	}
}
