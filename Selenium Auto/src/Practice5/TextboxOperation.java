package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextboxOperation {
	
	  public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.google.com");
	 
	   	WebElement senddata=driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		senddata.sendKeys("Selenium");
		
        Thread.sleep(3000);
        List<WebElement> sgs=senddata.findElements(By.xpath("//ul[@role=\"listbox\"]//li[@role=\"presentation\"]//div[@class=\"sbtc\"]"));
        System.out.println(sgs.size());
        for(int i=0; i<sgs.size(); i++) {
        	
        String sgslist=sgs.get(i).getText();
        System.out.println("All suggestions listname="+sgslist);
        
        if (sgslist.equalsIgnoreCase("selenium")) {
        	WebElement click=sgs.get(i);
        	click.click();
        	System.out.println("The data is found");
			
		} else {
			System.out.println("The data is not found");

		}
        break;
        }
       
      }}
		
	
	

