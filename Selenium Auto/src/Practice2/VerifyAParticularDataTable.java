package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAParticularDataTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		WebElement colms = driver.findElement(By.tagName("tr"));

		List<WebElement> rows_data = colms.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[4]"));

		for (int i = 0; i < rows_data.size(); i++) {

			String rows_value = rows_data.get(i).getText();

			System.out.println("Total value of row" + rows_value);

			WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[3]"));

			String datavalue = data.getText();

			System.out.println("The value of the element" + datavalue);

		}

	}

}
