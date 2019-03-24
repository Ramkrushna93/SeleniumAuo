package windowHandelling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchOneWindowToAnother {
	public static void main(String[] arge) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.naukri.com/");
		// driver.findElement(By.xpath("//a[@title=\"Employer Login\"]")).click();
		String parentwindows = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		System.out.println("Total window are" + windows.size());

		Object[] wins = windows.toArray();

		String Switch = wins[2].toString();

		driver.switchTo().window(Switch);

	}

}
