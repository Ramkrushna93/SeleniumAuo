package windowHandelling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.naukri.com/");
		String parentwindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Total windows are" + allWindows.size());

		Object[] temp = allWindows.toArray();

		for (int i = 0; i < temp.length; i++) {

			String childwindow = temp[i].toString();

			if (!childwindow.equalsIgnoreCase(parentwindow));
				

			driver.switchTo().window(childwindow);

			// driver.close();

			driver.switchTo().window(parentwindow);

			driver.findElement(By.xpath("//a[@title=\"Employer Login\"]")).click();

			Set<String> windows = driver.getWindowHandles();
			Object[] win = windows.toArray();

			System.out.println("the final window is" + win.length);
			String wins = win[2].toString();

			driver.switchTo().window(wins);
			Thread.sleep(3000);

			driver.findElement(By.id("RCBphone")).sendKeys("rk sahoo");

		}

	}

}
