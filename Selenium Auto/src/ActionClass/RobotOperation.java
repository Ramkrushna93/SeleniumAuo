package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotOperation {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		List<WebElement> data = driver.findElements(
				By.xpath("//a[@onclick=\"javascript:$CityDropDown.SetSelectedValue(this);return false;\"]"));

		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();

//		Robot rob=new Robot();
//		Thread.sleep(3000);
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_ENTER);
//				

	}

}
