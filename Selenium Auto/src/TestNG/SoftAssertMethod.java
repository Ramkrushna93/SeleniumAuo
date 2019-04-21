package TestNG;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertMethod {

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
		Assert.assertEquals(true, true);
	}

	@Test
	public void GoogleValidate() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();
		String title = driver.getTitle();
		System.out.println("The page title is---->" + title);
		softassert.assertEquals(title, "Google", " tile of the page");

		String url = driver.getCurrentUrl();
		System.out.println("The page url is---->" + url);
		softassert.assertEquals(url, "https://www.google.com/", "Url of the page");

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
		softassert.assertEquals(true, true);
		softassert.assertAll();
	}

	@AfterMethod
	public void CloseUp() {
		driver.close();

	}
}
