package ApplicationOperation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NaukriOperation1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.naukri.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Employer Zone']")).click();

		String parentwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		Object[] window = windows.toArray();
		String win = window[1].toString();
		driver.switchTo().window(win);
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[text()=\"POST A JOB\"]")).click();
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.size());
		Object[] allwin = wins.toArray();

		String allwins = allwin[5].toString();
		driver.switchTo().window(allwins);
		Thread.sleep(5000);

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		Thread.sleep(3000);

		driver.findElement(By.id("iddescription")).sendKeys("hdwdbakjiwhhwahuhudcd");
		driver.close();
		driver.switchTo().window(win);
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.quit();

	}

}
