package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOperation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-1/checkbox-1.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Mustard']")).click();
		
		List<WebElement> checkboxs=driver.findElements(By.xpath("//div[@role=\"checkbox\"]"));
		System.out.println("Total no of checkboxs are="+checkboxs);
		
		for(int i=0; i<checkboxs.size(); i++) {
			String checkboxname=checkboxs.get(i).getText();
			System.out.println("All checkbox name are="+checkboxname);
			
		}
		
	}

}
