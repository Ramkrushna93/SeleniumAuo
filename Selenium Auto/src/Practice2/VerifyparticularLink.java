package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyparticularLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total numbers of link are" + links.size());

		for (int i = 0; i < links.size(); i++) {

			String link_Name = links.get(i).getText();
			System.out.println("the link name is" + link_Name);

			if (link_Name.equalsIgnoreCase("Gmail")) {
				links.get(i).click();
				break;

			}

		}

	}
}
