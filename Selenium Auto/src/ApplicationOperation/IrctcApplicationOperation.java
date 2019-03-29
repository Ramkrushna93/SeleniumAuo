package ApplicationOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcApplicationOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement cli = driver.findElement(By.xpath("//label[text()='All Classes']"));
		cli.click();

		List<WebElement> data = cli.findElements(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/li"));
		System.out.println(data.size());

		for (int i = 0; i < data.size(); i++) {
			String datavalue = data.get(i).getText();

			if (datavalue.contains("AC 3 Tier (3A)")) {
				WebElement click = data.get(i);
				click.click();
				System.out.println("AC 3 Tire(3A) is found");
				break;

			}
		}

	}

}
