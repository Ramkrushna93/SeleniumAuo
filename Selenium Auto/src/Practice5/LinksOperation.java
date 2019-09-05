package Practice5;

import java.net.StandardSocketOptions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOperation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
		String linksname=links.get(i).getText();
		
		String linksurl=links.get(i).getAttribute("href");
		System.out.println(linksname+"-"+linksurl);
		
		if (linksname.equalsIgnoreCase("Gmail")) {
			WebElement click=links.get(i);
			click.click();
			
		}
		break;
		}
		
		
	}

}
