package Practice5;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelectetOrNot {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-1/checkbox-1.html");
		
	WebElement checkbox=driver.findElement(By.xpath("//div[text()=\"Sprouts\"]"));
//	driver.findElement(By.xpath("//div[text()=\"Tomato\"]")).click();
		
		if (checkbox.isSelected()) {
			checkbox.click();
			System.out.println("The checkbox is clicked");	
		}else {
			System.out.println("The checkbox is not clicked");
		}
	}

}
