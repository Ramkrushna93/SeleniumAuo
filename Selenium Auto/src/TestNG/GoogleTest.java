package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}

	@Test
	public void Title() {
		System.out.println(driver.getTitle());

	}

	@Test
	public void Url() {
		System.out.println(driver.getCurrentUrl());

	}

	@Test
	public void Links() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}

	@AfterMethod
	public void Quit() {
		driver.quit();
	}

}
