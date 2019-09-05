package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalenderOperation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[@title=\"Contacts\"]")));
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/ul/li[3]/a"))).click();
		act.perform();
		
		Select s1=new Select(driver.findElement(By.xpath("//select[@name=\"cs_title\"]")));
		s1.selectByVisibleText("Dr.");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@name=\"cs_default_address\"]"));
		checkbox.click();
		
		WebElement radio=driver.findElement(By.xpath("//input[@value=\"Y\"and@name=\"cs_receive_email\"]"));
				radio.click();
		
	}

}
