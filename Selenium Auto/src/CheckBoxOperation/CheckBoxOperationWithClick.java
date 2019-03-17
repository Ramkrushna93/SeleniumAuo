package CheckBoxOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOperationWithClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-form/");

		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Automation Tester']"));

		WebElement chbox = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		Thread.sleep(5000);

		checkbox.click();
		chbox.click();

	}

}
