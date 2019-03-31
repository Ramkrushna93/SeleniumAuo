package ApplicationOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailSendOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.name("identifier")).sendKeys("");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
//		Thread.sleep(3000);

		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		// Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@style=\"background-position:0 -138px\"]")).click();
//		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\":kc\"]/div/div")).click();
//		Thread.sleep(2000);

		driver.findElement(By.name("to")).sendKeys("");
		driver.findElement(By.name("subjectbox")).sendKeys("Taskcomplete");
		driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("My task is completed");

		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class=\"gb_ab gbii\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();

	}

}
