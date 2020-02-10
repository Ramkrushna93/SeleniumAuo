package ScreenshotOperation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToTakeFailedScreenShot {
	
	@Test
	public void takesFailScreenShot() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		
		try {
		driver.findElement(By.id("identifierId")).sendKeys("12345667");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		} catch(Exception e) {
			
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File(".\\ScreenShot\\facebook.jpg"));
			
			System.out.println("Failed ScreenShot is Taken");

		}
			
		
	}
	}


