package ApplicationOperation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartOperation2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ESCAPE);
		rob.keyRelease(KeyEvent.VK_ESCAPE);
		Actions act = new Actions(driver);
		Thread.sleep(5000);

		act.moveToElement(driver.findElement(By.xpath("//span[text()=\"Electronics\"]")));
		act.build().perform();
		Thread.sleep(3000);
		act.contextClick(driver.findElement(By.xpath("//*[text()=\"Realme\"]")));
		Thread.sleep(3000);
		act.build().perform();

		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		String parentwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Object[] wins = windows.toArray();
		String win = wins[1].toString();
		driver.switchTo().window(win);
		System.out.println("Title of the page" + driver.getTitle());

		driver.close();
		driver.switchTo().window(parentwindow);

	}

}
