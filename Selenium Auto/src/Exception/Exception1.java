package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception1 {
	WebDriver driver;

	@Test
	public void Login() throws InterruptedException {
		try {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.get("https://www.google.com/gmail/about/#");
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("SIGN IN")).click();

			driver.findElement(By.name("identi")).sendKeys("raju626189412@gmail.com");

			driver.findElement(By.name("identifier")).sendKeys(Keys.ENTER);

		} catch (Exception e) {

			System.out.println("The Element is not found");
			e.printStackTrace();

		} finally {
			driver.close();
		}

	}

}
