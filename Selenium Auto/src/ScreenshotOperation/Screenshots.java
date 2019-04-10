package ScreenshotOperation;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
         File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(scr,new File("./Screenshots/naukri.jpg"));
	}

}
