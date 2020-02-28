package DropDownOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Verify_Particular_Option_IsPresent_In_Dropdown_Or_Not {
	
	@Test
	public void verifyParticularValuePresentOrNotInDropDown() {
	System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/dropdowns");
	
	Select dropdown= new Select(driver.findElement(By.cssSelector("select#first")));
	
	List<WebElement> alloptions=dropdown.getOptions();
	
	for(int i=0; i<alloptions.size(); i++) {
		
		String dropdownvalues=alloptions.get(i).getText();
		
		if(dropdownvalues.equals("Iphone")) {
			
			System.out.println("DropDown value os Present in DropDown");
		} else {
			System.out.println("Dropdown value is not present in Dropdown");
		}
	}

}
}