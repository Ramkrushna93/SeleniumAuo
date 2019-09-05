package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailMailDeleteOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue");

		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'and@aria-label='Email or phone']")).sendKeys("");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"gb23\"]/span[1]")).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath("(//span[(@name='PNB Housing Fixed D.')])[2]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='gb_b gb_eb gb_R']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();

	}
}
