package SeleniumPractice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxOperation {
	
	WebDriver driver;
		 @BeforeMethod
		 public void Setup() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
		 driver.get("https://www.google.com/");
		 }
		 @Test
		 public void DataSend() throws InterruptedException, AWTException {
		//	 Robot ro=new Robot();
		//	 ro.keyPress(KeyEvent.VK_ESCAPE);
		//	 ro.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement senddata= driver.findElement(By.name("q"));
		senddata.clear();
		 senddata.sendKeys("Selenium");
		 System.out.println(senddata.getAttribute("value"));
		 Thread.sleep(4000);
		 List<WebElement> sgs=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li[@role=\"presentation\"]/div/div/span"));
		 System.out.println(sgs.size());
		
		 for(int i=0; i<sgs.size();i++) {
			 String sgsname=sgs.get(i).getText();
			 System.out.println(sgsname);
			 
			 if (sgsname.contains("selenium interview questions")) {
				 WebElement click=sgs.get(i);
				 click.click();
				 break;
				 
				
			}
		 }
		 
	 }


}
