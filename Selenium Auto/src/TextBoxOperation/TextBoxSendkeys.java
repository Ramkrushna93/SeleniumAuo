package TextBoxOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxSendkeys {
	

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement text_box=driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		text_box.clear();
		text_box.sendKeys("Mobile");
		
	}
	
	
}
	
	
	
	
	
	
	
	
	


