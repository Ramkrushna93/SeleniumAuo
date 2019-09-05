package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectoneElementFromDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"year\"]"));

		Select s1 = new Select(element);

		s1.selectByVisibleText("2018");
		System.out.println("The visible text is 2018");

	}

}
