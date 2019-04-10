package JavaScriptOperation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxOperation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById(\'email\').value=\'\'");
		js.executeScript("document.getElementById(\"pass\").value=\"\"");
	    
		//Click on particular element in javascript
		js.executeScript("document.querySelector(\"input[type='submit']\").click()");

	}

}
