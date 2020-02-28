package ScreenshotOperation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakesScreenShotOfAnHightLightElement {
	
	@Test
	public void screenShotHightLightElement() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
		Thread.sleep(3000);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr,new File(".\\ScreenShot\\hightlight.png"), true);
		
	}

}
