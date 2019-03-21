package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://api.jquery.com/dblclick/");

		// For Action object create
		Actions act = new Actions(driver);
		Thread.sleep(3000);

		// For finding location
		WebElement location = driver.findElement(By.xpath("/html/body/span"));

		// Use this line for double click operation
		act.doubleClick(location);

		act.perform();

	}

}
