package Practice4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TastCasesFailScreenShot {
	
	@Test
	public void TakeScreenShot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		  try {
		driver.get("https://accounts.google.com/signin/v2/identifier");
	 
        driver.findElement(By.id("identifierId")).sendKeys("");
        
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("hwgqudhiaj");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}catch(Exception e) {
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("./screenshot/gmailfail.jpg"));
		
		System.out.println("ScreenShot is taken");
		
		

}
}}