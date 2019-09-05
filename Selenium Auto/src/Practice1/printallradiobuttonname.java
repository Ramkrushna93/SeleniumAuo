package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printallradiobuttonname {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");

		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The all numbers of radiobutton" + radiobuttons.size());
		Thread.sleep(3000);

		for (int i = 0; i < radiobuttons.size(); i++) {

			String radiobutton_Name = radiobuttons.get(i).getAttribute("value");
			System.out.println("All radiobutton name" + radiobutton_Name);

		}
	}

}
