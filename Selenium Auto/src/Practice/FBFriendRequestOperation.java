package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBFriendRequestOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9668816507");

		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Lichi1993");

		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath("//a[@class='jewelButton _3eoa']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='_s0 _4ooo _rw img'and@aria-label='Ashok Patra']")).click();

		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//a[@role='button'and@data-tooltip-content='Delete Request'and@id='u_fetchstream_3_7']"))
				.click();
	}

}
