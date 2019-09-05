package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckBoxCouunts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");

		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println("The all no of checkboxs" + checkboxs.size());
	}

}
