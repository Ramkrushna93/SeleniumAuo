package JavaScriptOperation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
	
	public static void flash(WebElement element, WebDriver driver) {
		
		String bgcolour=element.getCssValue("backgroundcolour");
		for(int i=0 ;i< 500 ;i++) {
			ChangeColour("#000000", element, driver);
			ChangeColour(bgcolour, element, driver);
			
		}
	}
	
	public static void ChangeColour(String colour, WebElement element ,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolour ='"+ colour +"'",element);
	
	try {
		Thread.sleep(20);
		
	}	catch (InterruptedException e) {
			
		}
	}
	}


