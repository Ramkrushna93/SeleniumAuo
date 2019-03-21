package TableOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableoperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/#");

		WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i <= rows.size(); i++) {

			String rowData = rows.get(i)
					.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr[" + (i + 1) + "]/td[3]"))
					.getText();
			System.out.println("The rowData name is" + rowData);

		}

	}
}