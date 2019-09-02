package FindBrokenLinksInWebPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			
			String url=links.get(i).getAttribute("href");
			
			URL link=new URL(url);
			
			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();	
			
			//set timeout for 2 seconds
			httpcon.setConnectTimeout(2000);
			
			//connect using connect method
			httpcon.connect();
			
			
			if(httpcon.getResponseCode()>=400) {
				
				System.out.println(url+"-"+"is Broken Link"); 	
			} else {
				System.out.println(url+"-"+"is Valid link");
			}
			
			
			
			
		}
		
	}

}
