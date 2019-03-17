package CheckBoxOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckboxOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");

		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The no of checkbox are" + checkboxs.size());

		for (int i = 0; i < checkboxs.size(); i++) {

			String checkbox = checkboxs.get(i).getAttribute("vaule");
			System.out.println("The checkboxs name" + checkbox);

			if (checkbox.equalsIgnoreCase("value")) {
				System.out.println("the test case is pass");

			} else {

				System.out.println("the test case is failed");
			}
		}

	}
}
