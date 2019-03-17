package LinktestOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinktestOperation1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		List<WebElement> links;

		links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {

			String linkname = links.get(i).getText();
			System.out.println("The links name is /" + linkname);

			if (linkname.equalsIgnoreCase("Images")) {
				links.get(i).click();

			}

		}
	}
}