package Practice3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();

		String parentwindow = driver.getWindowHandle();

		Set<String> window = driver.getWindowHandles();

		Object[] win = window.toArray();
		System.out.println("Total windows are" + win);
		String wins = win[1].toString();

		driver.switchTo().window(wins);

		System.out.println("Show the title of the page" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);

	}

}
