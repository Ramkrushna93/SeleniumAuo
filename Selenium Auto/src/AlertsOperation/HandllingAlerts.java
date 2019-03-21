package AlertsOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

		String msg = driver.switchTo().alert().getText();

		System.out.println("What type message show in alert" + msg);
	}

}
