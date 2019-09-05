package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAllRadiobutton {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://toolsqa.com/automation-practice-form/");

		int radiobuttons = driver.findElements(By.xpath("//input[@type='radio']")).size();

		System.out.println("Total numbers of radiobutton" + radiobuttons);

	}
}
