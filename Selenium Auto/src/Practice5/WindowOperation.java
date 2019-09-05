package Practice5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowOperation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.findElement(By.linkText("Employer Zone")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println("Total no of windows are="+windows.size());
		Object[] win=windows.toArray();
		
		for(int i=0;i<win.length;i++) {
			String childwin=win[1].toString();
			
			driver.switchTo().window(childwin);
			System.out.println(driver.getCurrentUrl());
			
		}
		
		
	}

}
