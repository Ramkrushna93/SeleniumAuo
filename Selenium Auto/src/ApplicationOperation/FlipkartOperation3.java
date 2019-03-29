package ApplicationOperation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartOperation3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.flipkart.com");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ESCAPE);
		rob.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']")));
		act.build().perform();
		Thread.sleep(4000);
		List<WebElement> values = driver
				.findElements(By.xpath("(//ul[@class=\"_2OZ78M _1fj2FQ\"])[1]//li[@class=\"_1KCOnI _3ZgIXy\"]"));
		System.out.println(values.size());
		Thread.sleep(5000);
		for (int i = 0; i < values.size(); i++) {

			String alldata = values.get(i)
					.findElement(
							By.xpath("(//ul[@class=\\\"_2OZ78M _1fj2FQ\\\"])[1]//li[@class=\\\"_1KCOnI _3ZgIXy\\\"]"))
					.getText();
			System.out.println(alldata);
//			if (alldata.contains(alldata)) {
//				System.out.println(alldata);
//				act.contextClick(driver.findElement(By.xpath("(//ul[@class=\"_2OZ78M _1fj2FQ\"])[1]//li[@class=\"_1KCOnI _3ZgIXy\"]["+(i)+"]")));
//				act.build().perform();
//				
//	           rob.keyPress(KeyEvent.VK_DOWN);
//				rob.keyRelease(KeyEvent.VK_DOWN);
//				rob.keyPress(KeyEvent.VK_ENTER);
//				rob.keyRelease(KeyEvent.VK_ENTER);
//			
//				

		}
	}
}
