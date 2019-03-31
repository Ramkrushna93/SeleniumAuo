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
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailLogin {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\SeleniumTutorial\\CreatePropertiesFile\\configu.properties");

		prop.load(ip);

		String browsername = prop.getProperty("browser1");

		if (browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.contains("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browsername.contains("IE")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser not found");
		}
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("mail"));
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.xpath("//input[@type=\"password\"]")).click();

	}

}
