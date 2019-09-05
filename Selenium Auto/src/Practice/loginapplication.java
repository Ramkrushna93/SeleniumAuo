package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginapplication {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='_6qfu _5lxt _16ty']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	}
}