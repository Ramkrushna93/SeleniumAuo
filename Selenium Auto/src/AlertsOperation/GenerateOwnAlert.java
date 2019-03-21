package AlertsOperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateOwnAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.confirm('this is an userdefined alert ! Happy testing')");
		Thread.sleep(3000);

		Alert alt = driver.switchTo().alert();
		alt.dismiss();

		driver.quit();
	}

}
