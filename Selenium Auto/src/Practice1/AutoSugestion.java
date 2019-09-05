package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		Thread.sleep(4000);

		List<WebElement> sgs = driver.findElements(By.xpath("//ul[@class='col-11-12 _1PBbw8']//li[@class='_1va75j']"));

		System.out.println("The all numbers of suggestions" + sgs.size());
	}

}
