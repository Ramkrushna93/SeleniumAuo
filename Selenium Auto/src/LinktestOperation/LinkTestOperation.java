package LinktestOperation;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.linkText("Gmail")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		if (driver.getTitle().equalsIgnoreCase("Gmail - Free Storage and Email from Google")) {
			System.out.println("The testcase is Pass");

		} else {
			System.out.println("The testcase is Fail");

		}

	}
}
