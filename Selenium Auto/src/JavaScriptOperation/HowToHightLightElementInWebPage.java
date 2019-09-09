package JavaScriptOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHightLightElementInWebPage {
	
	@Test
	public void hightLightElement() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 1px solid red;');",element);
		
	}

}
