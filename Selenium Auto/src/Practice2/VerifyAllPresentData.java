package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyAllPresentData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));

		List<WebElement> elements = s1.getOptions();
		boolean exist = true;

		System.out.println("The all elements are" + elements.size());

		for (int i = 0; i < elements.size(); i++) {

			String data = elements.get(i - 1).getText();
			String presentdata = elements.get(i).getText();

			if (data.compareToIgnoreCase(presentdata) < 0) {
				exist = false;

				break;
			}
		}
		if (exist) {
			System.out.println("All the elements in a dropdown are ordered");

		} else
			System.out.println("all the elements present in dropdown are not ordered");

	}

}
