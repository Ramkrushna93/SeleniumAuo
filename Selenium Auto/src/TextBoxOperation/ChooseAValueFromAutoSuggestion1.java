package TextBoxOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseAValueFromAutoSuggestion1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement text_box = driver.findElement(By.xpath("//input[@onkeypress='clickGo(event, this)']"));
		text_box.clear();

		text_box.sendKeys("mobile");

		Thread.sleep(3000);

		List<WebElement> list = text_box.findElements(By.xpath(
				" //ul[@class='suggestionList_menu']//Li/descendent::div[@class='subdiv structured searchKeyWord']"));

		System.out.println("total no of suggestion in search box:::===>" + list.size());
	}

}
