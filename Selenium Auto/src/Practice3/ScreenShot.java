package Practice3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ScreenshotOperation.ScreenshotOperation1;

public class ScreenShot {
	public static void takesScreenshots() throws IOException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./Screenshots/spicejet.png"));
		
		System.out.println("Screenshot is taken");
	}
	
	public static void main(String[] args) throws IOException
	{
		ScreenshotOperation1.takesScreenshot();
}}
