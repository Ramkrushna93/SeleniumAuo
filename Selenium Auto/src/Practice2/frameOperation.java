package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/slider/");

//	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9668816507");

//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Lichi1993");
//		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		Thread.sleep(3000);

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println("Total no of frames" + frames.size());

	}

}
