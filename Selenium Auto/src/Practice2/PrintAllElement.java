package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		s1.selectByVisibleText("Dec");
		List<WebElement> elements = s1.getOptions();

		for (int i = 0; i < elements.size(); i++) {

			String data = elements.get(i).getText();
			System.out.println("The total data are" + data);
		}

	}

}
