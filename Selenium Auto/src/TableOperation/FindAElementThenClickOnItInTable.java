package TableOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAElementThenClickOnItInTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println("Total rows are" + rows.size());

		for (int i = 0; i < rows.size(); i++) {

			String allvalue = rows.get(i).getText();
			Thread.sleep(3000);
			if (allvalue.contains("Bank of India")) {
				WebElement value = rows.get(i)
						.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[" + (i + 1) + "]/td[1]"));
				JavascriptExecutor jst = (JavascriptExecutor) driver;
				jst.executeScript("arguments[0].click();", value);

				break;
			}

		}

	}

}
