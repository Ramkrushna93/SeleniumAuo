package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErameWorkOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();

		List<WebElement> frame = driver.findElements(By.tagName("frame"));

		System.out.println("The total no frame" + frame.size());
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[@title=\"Knowledge Base\"]")).click();

	}

}
