package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllCheckBoxName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");

		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println("Total numbers of checkboxs" + checkboxs.size());

		for (int i = 0; i < checkboxs.size(); i++) {

			String checkBox_Name = checkboxs.get(i).getAttribute("value");
			System.out.println("print all checkbox name" + checkBox_Name);

			driver.quit();

		}

	}

}
