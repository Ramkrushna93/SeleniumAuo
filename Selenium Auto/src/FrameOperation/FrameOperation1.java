package FrameOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOperation1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println("Total frame are" + frames.size());
		driver.switchTo().frame("iframe1");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("");

	}
}
