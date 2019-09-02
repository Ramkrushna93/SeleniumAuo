package CookiesOperation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllCookiesInAApplication {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		 Set<Cookie> cookies=driver.manage().getCookies(); // Get all cookies size in an page
		 System.out.println(cookies.size());
		 
		 for(Cookie cookie : cookies) {
			 
			 System.out.println(cookie.getName()+" "+cookie.getValue());
			 
		 }
	}

}
