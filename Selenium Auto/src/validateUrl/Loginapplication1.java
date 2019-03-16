package validateUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginapplication1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).sendKeys("");

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		String actUrl = driver.getCurrentUrl();
		if (actUrl.equalsIgnoreCase("https://mail.google.com/mail/u/0/#inbox")) {

			System.out.println("The testcase is pass");

		} else {

			System.out.println("The testcase is fail");
		}

	}
}
