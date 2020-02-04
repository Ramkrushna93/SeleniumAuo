package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsClassOperation {
	
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\workspace2\\SeleniumPractice\\Driver\\chromedriver (1).exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");		
}
	@Test(priority=1)
	public void doubleclickOPeration() throws InterruptedException {
		
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).build().perform();
		Thread.sleep(3000);
			
	}
	
	@Test(priority=2)
	public void sliderOperation() throws InterruptedException {
		
		WebElement slider=driver.findElement(By.xpath("//span[@style=\"left: 0%;\"]"));
		Actions act=new Actions(driver);
		Action action=act.dragAndDropBy(slider, 30, 0).build();
		action.perform();	
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void resizeableOperation() throws InterruptedException {
		WebElement resizeable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(resizeable, 200, 200).build().perform();
		Thread.sleep(3000);
	}
	@BeforeMethod
	public void teatDown() throws InterruptedException {
		
		driver.quit();
	}
	

}
