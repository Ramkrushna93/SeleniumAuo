package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperation1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr/td"));
		System.out.println("No of cols" + cols.size());

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr"));
		System.out.println("No of rows" + rows.size());

	}
}
