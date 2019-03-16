package validateUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginapplication {

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");

		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");

		driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
		String actUrl = driver.getCurrentUrl();

		if (actUrl.equalsIgnoreCase("https://www.facebook.com/mobileprotection?source=mobile_mirror_nux")) {
			System.out.println("the test case is pass");

		} else {

			System.out.println("the test case is fail");
		}
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	}

}
