package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));
		textbox.sendKeys("mobile");

		List<WebElement> sgs = textbox.findElements(
				By.xpath("//ul[@class='suggestionList_menu']//li[@class='suggestionList_menuitem unstructuredList']"));

		System.out.println("The all suggestions in snapdeal" + sgs.size());
		for (int i = 0; i < sgs.size(); i++) {

			String sgsdata = sgs.get(i).getText();
			Thread.sleep(3000);
			if (sgsdata.equalsIgnoreCase("mobile")) {

				sgs.get(i).click();
				break;
			}

		}
	}

}
