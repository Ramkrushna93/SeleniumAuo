package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[6]/span")));

		act.perform();
		act.contextClick(driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[6]/ul/li/ul/li[2]/ul/li[1]/a")));

		act.build().perform();

		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();

	}

}
