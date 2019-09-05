package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOperation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@value=\"Selenium Webdriver\"]"));
		
		
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("TOTAL CHECKBOXS ARE"+checkboxs.size());
		
		for(int i=0 ;i<checkboxs.size() ; i++) {			
			String checkboxname=checkboxs.get(i).getAttribute("value");
			System.out.println("The all checkboxs name are"+checkboxname);
		}	
			if (!checkbox.isSelected()) {
				checkbox.click();
				System.out.println("The testcase is pass");
			}else {
				System.out.println("The testcase is fail");
				
			
		}
}}


