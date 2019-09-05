package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioOperation extends CheckBoxOperation {
	
	@Test
	public void RadioOper() {
		
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(int i=0;i<radios.size();i++) {
			
			String radioname=radios.get(i).getAttribute("value");
			System.out.println(radioname);
		}
		WebElement radioclick=driver.findElement(By.id("sex-0"));
		if (!radioclick.isSelected()) {
			radioclick.click();
			System.out.println("The radio button is clicked");
		}else {
			System.out.println("The radio button is not clicked");
		}
	}
	
	

}
