package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktestOperations {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("All links are in a page"+links.size());
		
		for(int i=0 ; i<links.size() ;i++) {
	    String linksname=links.get(i).getText();
	    
		String linksurl=links.get(i).getAttribute("href");
	    System.out.println(linksname+"_"+linksurl);
	    
		}}
		
	}


