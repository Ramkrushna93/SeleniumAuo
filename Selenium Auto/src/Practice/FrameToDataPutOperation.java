package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameToDataPutOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"IF1\"]")));
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		Thread.sleep(3000);

		driver.quit();

	}

}
