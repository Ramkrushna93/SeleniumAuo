package windowHandelling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukriWindowOperation {
	WebDriver driver;
	@Test
	public void SetUp() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
		 driver.get("https://www.naukri.com/");
	
		 String parentwindow=driver.getWindowHandle(); 
		 
		
		 Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//div[text()=\"Companies\"]")));
		 act.sendKeys(Keys.ARROW_DOWN);
		 act.build().perform();
		 act.click();
		 act.build().perform();
		 
		 Set<String> allwindows=driver.getWindowHandles();
		 System.out.println(allwindows.size());
		 
		 Object[] wins=allwindows.toArray();
		 String win=wins[1].toString();
		 driver.switchTo().window(win);
		 
		 WebElement valuesand=driver.findElement(By.name("qp"));
		 valuesand.sendKeys("Selenium");
		 
		 for(int i=0 ; i<allwindows.size();i++) {
			 String compairwin=wins[i].toString();
			 if(compairwin.contains(parentwindow)) {
				 driver.close();
				 driver.switchTo().window(parentwindow);
			 }
		 }
		 
		 
	}
}
