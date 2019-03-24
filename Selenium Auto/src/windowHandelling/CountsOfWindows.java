package windowHandelling;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountsOfWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");

		driver.findElement(By.xpath("//a[@title=\"Employer Login\"]")).click();

		String ParentWindow = driver.getWindowHandle();

		Set<String> Windows = driver.getWindowHandles();

		System.out.println("Total window are" + Windows.size());

	}

}
