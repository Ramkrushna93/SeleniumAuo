package CreatePropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		Properties propo = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\SeleniumTutorial\\CreatePropertiesFile\\configu.properties");

		propo.load(ip);
		System.out.println(propo.getProperty("browser"));

		String browsername = propo.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("FF")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("The browser is not found");
		}

		driver.get(propo.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(propo.getProperty("phone"));
		driver.findElement(By.id("pass")).sendKeys(propo.getProperty("password"));
		driver.findElement(By.id("loginbutton")).click();

	}

}
