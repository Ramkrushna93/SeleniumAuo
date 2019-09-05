package Practice5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukriOperation {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employer Zone")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.size());
		
		Object[] win=wins.toArray();
		String window=win[1].toString();
		driver.switchTo().window(window);
		Thread.sleep(3000);
		
		driver.findElement(By.id("callbackChk")).click();
		driver.findElement(By.id("RCBcontactPerson")).sendKeys("Raju");
		
		driver.switchTo().defaultContent();
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()=\"Companies\"]")));
		act.build().perform();
		
		
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.click();
		act.build().perform();
		
		
		
		
		
		
		
	}}
	


