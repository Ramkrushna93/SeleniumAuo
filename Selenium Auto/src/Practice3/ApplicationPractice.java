package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ApplicationPractice {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.reliancetrends.com/");
		
		WebElement reliance=driver.findElement(By.id("input_SearchBox"));
		reliance.sendKeys("shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"fnl-header-searchBtn\"]")).click();
		
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"facetContainer\"]/div[2]/div[1]/div[1]/div[4]/div[1]/ul/li[1]/div/a/div/label"));
		
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"facetContainer\"]/div[2]/div[1]/div[1]/div[4]/div[1]/ul/li[4]/div/a/div/label"));
		checkbox2.click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		WebElement dragloc=driver.findElement(By.xpath("//div[@class=\"pointer high\"and@style=\"left: 177px;\"]"));
		act.doubleClick();
		WebElement droploc=driver.findElement(By.xpath("//div[@class=\"pointer high last-active\"and@style=\"left: 68px;\"]"));
		act.doubleClick();
		act.dragAndDrop(dragloc, droploc);
		
		act.build().perform();
		Thread.sleep(8000);
				
				
				
				
				
				
				
				
		
		
	}

}
