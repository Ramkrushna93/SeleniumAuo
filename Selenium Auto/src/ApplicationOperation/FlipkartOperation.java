package ApplicationOperation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com");
		Actions act = new Actions(driver);
		Thread.sleep(6000);
		act.moveToElement(driver.findElement(By.xpath("/li[2]/span")));
		act.build().perform();

		act.contextClick(driver.findElement(By.xpath("//a[@title=\"Microwave Ovens\"]")));
		act.build().perform();
		// act.sendKeys(Keys.ARROW_DOWN);
		// act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();

//		String parentwindow=driver.getWindowHandle();
//		Set<String> windows=driver.getWindowHandles();
//		
//		Object[] win=windows.toArray();
//		System.out.println("total window"+windows.size());
//		String wins=win[0].toString();
//		
//		driver.switchTo().window(wins);

		Actions acti = new Actions(driver);
		WebElement click = driver.findElement(By.xpath("//div[@style=\"transform: translateX(-1.19px);\"]"));
		WebElement Hold = driver.findElement(By.xpath("//div[@style=\"transform: translateX(-119.595px);\"]"));

		acti.clickAndHold();
		acti.build().perform();

	}

}
