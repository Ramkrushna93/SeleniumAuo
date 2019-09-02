package HowToHandleStaleElementExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToHandleStaleElementException1 {
	WebDriver driver;
    @BeforeMethod
    public void setUp() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
	 driver.get("http://www.pavantestingtools.com/p/sql-tutorials.html");

}
    @Test
    public void handleStaleElementException() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	WebElement element=driver.findElement(By.xpath("//a[text()='Training']"));
    	element.click();
    	
    	driver.navigate().back();
    		
    	try
    	{
  
    	element.click();
    	
    	}catch(StaleElementReferenceException e) {
    		
    	 element=driver.findElement(By.xpath("//a[text()='Training']"));
    	 element.click();
    		
    		
    	}
    	
    }
    
}
    
    
    
    
    
    
    
