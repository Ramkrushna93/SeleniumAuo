package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));

		textBox.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> autosgs = textBox.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));

		System.out.println("The no of suggestions" + autosgs.size());

	}

}
