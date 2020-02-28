package DropDownOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class How_To_Check_SingleValueDropDown_MultipleValueDropDown {
	
	@Test
	public void checkMultipleOrSingleDropdown() {
	System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/dropdowns");
	
	Select dropdown=new Select(driver.findElement(By.cssSelector("select#second")));
	
	boolean SingleOrMultiple=dropdown.isMultiple();
	
	if(SingleOrMultiple) {
		
		System.out.println("DropDown is Multi Value Dropdown");
	} else {
		System.out.println("Dropdown is single value DropDown");
	}
	
	

}
}