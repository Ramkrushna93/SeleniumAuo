package ApplicationOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartOperation1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com");
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()=\"Electronics\"]")));
		act.build().perform();
		Thread.sleep(3000);
		List<WebElement> alldata = driver.findElements(By.xpath(
				"(//ul[@class=\"_2OZ78M _1fj2FQ\"])[1]//li[@class=\"_1KCOnI _3ZgIXy\"or@class=\"_1KCOnI _2BfSTw _1h5QLb _3ZgIXy\"]/a"));
		System.out.println("Total data are" + alldata.size());
		Thread.sleep(4000);
		for (int i = 0; i < alldata.size(); i++) {
			String allname = alldata.get(i).getText();
			System.out.println(allname);

		}

	}
}
