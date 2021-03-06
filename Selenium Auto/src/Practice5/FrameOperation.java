package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOperation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of frame="+frames.size());
		
		driver.switchTo().frame("iframe1");
		WebElement senddata=driver.findElement(By.name("lastname"));
		senddata.sendKeys("Raju");
		
		driver.switchTo().defaultContent();
		
	}

}
