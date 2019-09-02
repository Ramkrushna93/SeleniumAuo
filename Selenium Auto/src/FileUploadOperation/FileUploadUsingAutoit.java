package FileUploadOperation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadUsingAutoit {
	WebDriver driver;
	@Test
	public void SetUp() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/autoit.html");
        
        driver.findElement(By.id("postjob")).click();
        driver.findElement(By.id("input_3")).sendKeys("Raju");
        
        driver.findElement(By.id("id_4")).sendKeys("");					
        driver.findElement(By.id("input_4")).click();
        
       
        Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
			}
	
		
		
		
		
		
		
		
	

}
