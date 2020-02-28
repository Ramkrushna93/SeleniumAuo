package ScreenshotOperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToTakeScreenShotEachWebElement {
	
	@Test
	public void takesscreenShot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\workspace2\\SeleniumPractice\\Driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		WebElement textbox=driver.findElement(By.name("q"));
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		takesScreenShot1(textbox,"textfield");
		takesScreenShot1(gmail,"gmailfield");
		
	}
	
	public static void takesScreenShot1(WebElement element, String name) {
		
		try {
		File scrfile=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("./ScreenShots/"+name+".jpg"));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
