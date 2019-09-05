package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");

		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"sex-0\"]"));

		if (radiobutton.isSelected()) {
			System.out.println("The radiobutton is not click before so click here");
			radiobutton.click();

		} else {
			System.out.println("The radiobutton is click before");
		}
	}

}
