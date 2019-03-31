package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tryCatch {

	WebDriver driver;

	@Test
	public void m1() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");

			driver.findElement(By.id("ehjwgfbwjig")).click();

		} catch (java.lang.IllegalStateException r) {
			System.out.println("the path is not set for tancehe driver inst");
		} catch (NullPointerException b) {
			System.out.println("The element i=d is not found");
		}

		catch (NoSuchElementException e) {

			System.out.println("Test case is failed");

		}

		finally {
			driver.quit();
		}

	}
}
