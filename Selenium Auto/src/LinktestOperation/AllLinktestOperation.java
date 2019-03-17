
package LinktestOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinktestOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		List<WebElement> links;

		links = driver.findElements(By.tagName("a"));
		System.out.println("no of links " + links.size());

		for (int i = 0; i < links.size(); i++)

		{
			String Linkname = links.get(i).getText();

			String url = links.get(i).getAttribute("href");
			System.out.println(Linkname + "-" + url);
		}
	}
}