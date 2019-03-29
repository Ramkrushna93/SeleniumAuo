package ApplicationOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipidiaOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.wikipedia.org/");
		List<WebElement> links = driver.findElements(By.xpath("//a[@class=\"link-box\"]"));

		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getAttribute("id"));

		}

	}

}
