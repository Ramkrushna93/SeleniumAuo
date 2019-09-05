package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyACheckBoxSelectedOrNot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://toolsqa.com/automation-practice-form/");

		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"tool-2\"]"));
		textbox.click();

		if (textbox.isSelected()) {
			System.out.println("The testcase is pass");

		} else {
			System.out.println("The testcase is fail");

		}
	}

}
