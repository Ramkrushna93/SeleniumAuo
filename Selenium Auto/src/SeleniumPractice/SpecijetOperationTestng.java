package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SpecijetOperationTestng {
	WebDriver driver;
	SoftAssert soft=new SoftAssert();
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.spicejet.com/");
		
	}
	@Test(priority=1,invocationCount=2)
	public void DropDown() {
		

		
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByVisibleText("USD");
		soft.assertEquals(true, true);
		
	}	
	@Test(priority=0)
	public void DropDownCount() {
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		List<WebElement> allvalue=s1.getOptions();
		
		for(int i=0; i<allvalue.size();i++) {
			String valuename=allvalue.get(i).getText();
		System.out.println("Total present data in dropdown="+valuename);
		soft.assertEquals(true,true);
		}}
		@Test(priority=3)
		public void AnotherApp()  {
			driver.get("");
			
		}
	
		
		
		
		
	

}
