package DropDownOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BootStripDropDown {
	public WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		 
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 
	}

	@Test
	public void BootStripDropDownOperation() {
		WebElement element=driver.findElement(By.xpath("//label[@class=\"ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted\"]"));
		element.click();
		
		List<WebElement>dropdownlist=element.findElements(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/li/span"));
		System.out.println(dropdownlist.size());
		
		for(int i=0; i<dropdownlist.size();i++) {
			String dropdownname=dropdownlist.get(i).getText();
			System.out.println(dropdownname);
			
			if(dropdownname.contains("Second Sitting (2S)")) {
				dropdownlist.get(i).click();
				
				System.out.println("dropdown value is selected");
				
			}else {
				
				System.out.println("dropdown value is not selected");
			}
		}
	}
}
