package ScreenshotOperation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ScreenshotOperation1 {
	public static void takesScreenshot() throws IOException
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/facebook.jpg"));
		
		System.out.println("Screenshot taken");
		
		//driver.quit();
		
				}
	public static void main(String[] args) throws IOException{                    
	ScreenshotOperation1.takesScreenshot();	
	}

}
