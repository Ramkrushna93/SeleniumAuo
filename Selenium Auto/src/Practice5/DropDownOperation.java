package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOperation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
	    Select s1=new Select(driver.findElement(By.name("birthday_month")));
	    s1.selectByVisibleText("Apr");
	    
	    List<WebElement>value=s1.getOptions();
	    System.out.println(value.size());
	    
	    for (int i = 0; i < value.size(); i++) {
	    	
	    	String valuename=value.get(i).getText();
	    	System.out.println(valuename);
			
		}
	    
	    
	   	
	}

}
