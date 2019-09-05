package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		// Total numbers of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));

		System.out.println("The total numbers of rows" + rows.size());

		// Total numbers of cols

		List<WebElement> cols = driver.findElements(By.tagName("td"));

		System.out.println("The total numbers of colomb" + cols.size());
	}

}
