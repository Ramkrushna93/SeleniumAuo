package ApplicationOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateSendkeysData {
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
	}

	@Test
	public void ValidateData() throws InterruptedException {
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Selenium");
		Thread.sleep(4000);
		String PresentData = text.getAttribute("value");
		System.out.println(PresentData);

		if (PresentData.equalsIgnoreCase("Selenium")) {
			System.out.println("The entered data is valid");

		} else {
			System.out.println("The entered data is invalid");

		}
	}

	@AfterMethod
	public void CloseUp() {
		driver.close();
	}

}
