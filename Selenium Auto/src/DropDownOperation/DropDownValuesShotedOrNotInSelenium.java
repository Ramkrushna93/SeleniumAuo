package DropDownOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownValuesShotedOrNotInSelenium {
	
	@Test
	public void dropDownValuesShoted() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/dropdowns");
	
	WebElement element=driver.findElement(By.id("animals"));
	
    Select s1=new Select(element);
    
    List<String> originallist=new ArrayList<>();
    
    for(WebElement s :s1.getOptions()) {
    	
    	originallist.add(s.getText());
    }
    
    // logic block starts
    
    List<String> templist=originallist;
    Collections.sort(templist);
    
    Assert.assertEquals( templist, originallist);
    
    System.out.println("This is the Originallist before sorting  "+originallist);
    
    System.out.println("This is the templist after sorting  "+templist);

}
}