package Practice3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GHowToTakeactionOnAlert {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement opt=driver.findElement(By.xpath("//button[@onclick=\"pushConfirm()\"]"));
		opt.click();
		
		Alert alt=driver.switchTo().alert();
		String altmsg=alt.getText();
		
		if (altmsg.contains("Confirm pop up with OK and Cancel button")){ 
			
			System.out.println("The msg found then accept");
			alt.accept();
			
		} else {
			System.out.println("The msg not found dismiss");
			alt.dismiss();

		}
		
	}

}
