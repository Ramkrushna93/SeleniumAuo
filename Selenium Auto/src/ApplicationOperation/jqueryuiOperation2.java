package ApplicationOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryuiOperation2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/");

		driver.findElement(By.linkText("Resizable")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		// WebElement click=driver.findElement(By.xpath("//div[@style=\"z-index:
		// 90;\"]"));

		act.clickAndHold(driver.findElement(By.xpath("//div[@style=\"width: 91px; height: 89px;\"]")));
		act.build().perform();

	}

}
