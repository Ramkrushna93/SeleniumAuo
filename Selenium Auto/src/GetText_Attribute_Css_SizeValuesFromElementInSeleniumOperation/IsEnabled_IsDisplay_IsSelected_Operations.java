package GetText_Attribute_Css_SizeValuesFromElementInSeleniumOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsEnabled_IsDisplay_IsSelected_Operations {

	// isDisplayed method in selenium webdriver verifies and returns a boolean
	// value-based on the state of the element,
	// whether it is displayed or not.
	
	@Test(priority=1)
	public void isDisplayOperation() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		
		boolean displayed=driver.findElement(By.xpath("(//button[@id=\"disabled\"])[1]")).isDisplayed();
		
		System.out.println("Element Displayed is "+displayed);
		
	}
	
	//isEnabled() method in selenium webdriver verifies and returns a boolean value based on the state of the element,
	//whether it is enabled or not.

	@Test(priority=2)
	public void isEnabled() {
		
			// set chrome driver exe path
			System.setProperty("webdriver.chrome.driver", "C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://chercher.tech/selenium-webdriver-sample");
			// verify whether button is enabled or not ?
			boolean enabled = driver.findElement(By.xpath("//button[@disabled]")).isEnabled();
			System.out.println("Element State is : "+ enabled);
		}
	
//	isSelected() verifies if an element is selected or not. isSelected()
	//returns a boolean value, true if the element is selected and false if it is not.
	
	@Test(priority=3)
	public void isSelected() {
		System.setProperty("webdriver.chrome.driver", "C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		// verify whether checkbox is selected or not ?
		boolean selected = driver.findElement(By.xpath("//input[@id='selected']")).isSelected();
		System.out.println("Is checkbox selected ? : "+ selected);
	}

}
