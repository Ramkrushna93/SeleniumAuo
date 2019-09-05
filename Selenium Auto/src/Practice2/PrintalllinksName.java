package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintalllinksName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("All links " + links.size());

		for (int i = 0; i < links.size(); i++) {
			String linkname = links.get(i).getText();
			String urlname = links.get(i).getAttribute("heref");
			System.out.println(linkname + "_" + urlname);
		}
	}

}
