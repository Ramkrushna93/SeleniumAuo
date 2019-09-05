package TooltipsOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class tooltipsOperation {

	@Test
	public void tooltips() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		
		String tooltipstitle=driver.findElement(By.xpath("(//a[contains(text(),'Projects')])[1]")).getAttribute("title");
		System.out.println("Title of the project"+tooltipstitle);
		
		Assert.assertEquals(tooltipstitle,"Selenium Projects");
		

	}

}
