package Practice3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplicationOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");

		WebElement data = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"));
		data.click();
		List<WebElement> alldata = data.findElements(
				By.xpath("//a[@onclick=\"javascript:$CityDropDown.SetSelectedValue(this);return false;\"]"));

		for (int i = 0; i < alldata.size(); i++) {
			String value = alldata.get(i).getText();

			System.out.println(value);
		}

	}
}
