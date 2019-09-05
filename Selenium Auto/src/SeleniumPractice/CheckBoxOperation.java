package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxOperation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}
	@Test
	public void CheckBox() {
		
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println(checkboxs.size());
		
		for(int i=0;i<checkboxs.size();i++) {
			String checkname=checkboxs.get(i).getAttribute("value");
			System.out.println("All checkboxs name"+checkname);
		}
		WebElement checkboxclick=driver.findElement(By.id("profession-1"));
		
		if(!checkboxclick.isSelected()) {
			checkboxclick.click();
			System.out.println("The checkbox is clicked");
		}else {
			System.out.println("The checkbox is not clicked");
		}
		
			
				
			
		}
	}

