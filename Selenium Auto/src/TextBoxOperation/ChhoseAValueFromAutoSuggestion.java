package TextBoxOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChhoseAValueFromAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		WebElement table = driver.findElement(By.id("lst-ib"));

		table.sendKeys("Selenium");

		Thread.sleep(2000);

		List<WebElement> sgs = table.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));

		System.out.println("the number of suggestion is :" + sgs.size());

		for (int i = 0; i < sgs.size(); i++) {

			String sgsdata = sgs.get(i).getText();
			Thread.sleep(3000);

			if (sgsdata.equalsIgnoreCase("selenium tutorial")) {

				sgs.get(i).click();
				break;

			}
		}

	}
}
