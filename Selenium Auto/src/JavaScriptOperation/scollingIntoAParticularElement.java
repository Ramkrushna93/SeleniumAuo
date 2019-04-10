package JavaScriptOperation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollingIntoAParticularElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.querySelector(\"a[title='Visit our Help Centre.']\").scrollIntoView()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"a[title='Visit our Help Centre.']\").click()");
		driver.close();
	}

}
