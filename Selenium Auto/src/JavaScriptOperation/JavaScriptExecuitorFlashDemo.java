package JavaScriptOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuitorFlashDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.twoplugs.com/");
		
		WebElement button=driver.findElement(By.xpath("(//a[@class=\\\"btn green\\\"])[1]"));
		JavaScriptUtils.flash(button, driver);
		
	}

}
