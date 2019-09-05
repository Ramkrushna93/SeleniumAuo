package Practice5;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class takeFailScreenShot {
	
	WebDriver driver;
	
	@Test
	public void setUp() throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		try {
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("hqwguy");
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys(Keys.ENTER);
		}catch(Exception e) {
		
        TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshot/gmail.png"));
		System.out.println("ScreenShot is taken");
	}

}
}