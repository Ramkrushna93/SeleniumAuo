package JavaScriptOperation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToAnotherPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.history.back()");
		js.executeScript("window.history.forward()");
		
		System.out.println(driver.getTitle());
		
	}

}
