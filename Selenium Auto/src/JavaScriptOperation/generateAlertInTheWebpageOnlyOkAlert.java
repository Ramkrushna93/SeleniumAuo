package JavaScriptOperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generateAlertInTheWebpageOnlyOkAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('raju generate alert')");

		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
