package CheckBoxOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Automation Tester']"));

		if (!checkbox.isSelected()) {
			checkbox.click();

			System.out.println("checkbox is  clicked");

		} else {

			System.out.println(" checkbox is already  Clicked");
		}
		Thread.sleep(5000);

		driver.quit();

	}
}
