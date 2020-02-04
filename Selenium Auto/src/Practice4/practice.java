package Practice4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println(cols.size());

		for (int i = 0; i < rows.size(); i++) {

			String colsval = rows.get(i).getText();

			if (colsval.contains("UCO Bank")) {

				WebElement click = rows.get(i)
						.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[" + (i + 1) + "]/td[1]/a"));
				click.click();
				break;

			}

		}

	}

}