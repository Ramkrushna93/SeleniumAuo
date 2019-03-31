package CreatePropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebookOperation {
	@Test
	public void SetUp() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\SeleniumTutorial\\CreatePropertiesFile\\configu.properties");

		 prop.load(ip);
		
	 driver.get(prop.getProperty("url"));
	 
	 driver.findElement(By.id("email")).sendKeys(prop.getProperty("Email"));
	 driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
	 
	 driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);

		 
		 
		
		
	}
}
