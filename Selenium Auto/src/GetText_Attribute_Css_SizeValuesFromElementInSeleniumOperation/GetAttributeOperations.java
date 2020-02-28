package GetText_Attribute_Css_SizeValuesFromElementInSeleniumOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttributeOperations {
	
	//getAttibute() method fetches the value of an attribute, in HTML code whatever
	//is present in the left side of '=' is an attribute, value on the right side is an attribute value
	@Test(priority=1)
	public void getAttribute() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		
		String idAttribute=driver.findElement(By.tagName("button")).getAttribute("id");
		System.out.println("Attribute id is"+idAttribute);
	}
	@Test(priority=2)
	public void getAttribute2() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		
		String idAttribute=driver.findElement(By.tagName("button")).getAttribute("name");
		System.out.println("Attribute id is"+idAttribute);
	}
	
	@Test(priority=3)
	public void getAttribute3() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		
		String idAttribute=driver.findElement(By.tagName("button")).getAttribute("checked");
		System.out.println("Attribute id is"+idAttribute);
	}

}
