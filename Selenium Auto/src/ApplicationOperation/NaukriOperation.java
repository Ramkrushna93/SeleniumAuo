package ApplicationOperation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");

		Actions act = new Actions(driver);
		act.moveToElement(
				driver.findElement(By.xpath("//a[@data-ga-track=\"Main Navigation Services|Services Icon\"]")));
		act.build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='IT & Telecom']")));

		act.click();
		act.build().perform();
		String parentwindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();
		System.out.println("Total widow" + windows.size());

		Object[] win = windows.toArray();
		String wins = win[1].toString();

		driver.switchTo().window(wins);

		driver.findElement(By.xpath("//input[@placeholder=\"What do you want to learn today?\"]"))
				.sendKeys("Telecommunication");
		driver.findElement(By.id("srch_btn1")).click();

		driver.close();
		driver.switchTo().window(parentwindow);

	}

}
