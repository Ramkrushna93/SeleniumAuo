package DropDownOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompairDropDownValue {
	
	@Test
	public void compairDropDownValue() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/dropdowns");
		
		Select sel=new Select(driver.findElement(By.cssSelector("select#first")));
		
		List<WebElement> droplist=sel.getOptions();
		
		List<String> orglist=new ArrayList<>();
	
		for(WebElement element : droplist) {
			
			orglist.add(element.getText());
			System.out.println(orglist);
			
		}
			Select sel1=new Select(driver.findElement(By.id("order-same")));
			List<WebElement> droplist2=sel1.getOptions();
			List<String> orglist2=new ArrayList<>();
			
			for(WebElement element2 : droplist2) {
				
				orglist2.add(element2.getText());
				
				System.out.println(orglist2);
			}
			
			Assert.assertEquals(orglist, orglist2);
			
		}
		
		
		
		
	}


