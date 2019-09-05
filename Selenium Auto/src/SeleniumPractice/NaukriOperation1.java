package SeleniumPractice;

import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NaukriOperation1 extends NaukriOperation {
	
	@Test
	public void WindowOperation() {
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Companies']")));
		act.sendKeys(Keys.ARROW_DOWN);
		act.click();
		act.build().perform();
		
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		System.out.println("Total window are"+windows.size());
		
		Object[] wins=windows.toArray(); 
		String window=wins[2].toString();
		driver.switchTo().window(window);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Experience\"]")).click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ESCAPE);
		
		
		
	}

}
