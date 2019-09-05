package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameOperation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		System.out.println("Total frame are"+frames.size());
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@onclick=\"expandPanel(this);\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("leftpanel");
		Select s1=new Select(driver.findElement(By.xpath("//select[@name=\"doaction\"]")));
		s1.selectByValue("OWNER");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"submit\"and@value=\" = SUBMIT = \"]")).click();
		Thread.sleep(2000);
		
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		Select s2=new Select(driver.findElement(By.xpath("//select[@name=\"search_target\"]")));
//		s2.selectByValue("WEB");
	}

}
