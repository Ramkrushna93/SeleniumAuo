package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonoperation {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement radio=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
//		radio.click();
		
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("all radiobuttons are"+radiobuttons.size());
		
		for(int i=0 ; i<radiobuttons.size() ; i++) {
			String radiosname=radiobuttons.get(i).getAttribute("value");
			System.out.println("all radiobuttons name are"+radiosname);
		}
			
			if (!radio.isSelected()) {
				radio.click();
				System.out.println("The radiobutton is clicked");
				
			} else {
				System.out.println("The radiobutton is not clicked");

			
			
			
		
	}

}}