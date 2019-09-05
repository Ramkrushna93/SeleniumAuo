package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");

		WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));

		TextBox.sendKeys("mobile");

		List<WebElement> boxData = TextBox.findElements(
				By.xpath("//ul[@class='suggestionList_menu']//li[@class='suggestionList_menuitem unstructuredList']"));

		System.out.println("The no of autosuggestion" + boxData.size());

		for (int i = 0; i < boxData.size(); i++) {
			String sgsdata = boxData.get(i).getText();

			if (sgsdata.equalsIgnoreCase("Mobile")) {

				Thread.sleep(6000);

				boxData.get(i).click();

			}
		}
	}

}
