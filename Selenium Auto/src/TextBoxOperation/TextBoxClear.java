package TextBoxOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxClear {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		WebElement text_box=driver.findElement(By.xpath("//input[@id='search']"));
		text_box.clear();
		
		
		
		
		
		
		
		
		
		

}
}