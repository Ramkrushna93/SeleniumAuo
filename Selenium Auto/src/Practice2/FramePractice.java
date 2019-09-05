package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title=\"Contacts\"]")).click();

		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();

	}

}
