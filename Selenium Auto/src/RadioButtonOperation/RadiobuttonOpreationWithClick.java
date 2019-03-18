package RadioButtonOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonOpreationWithClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='1']"));

		radiobutton.click();

		if (radiobutton.isSelected()) {
			System.out.println("The radiobutton is before clicked");

		} else {

			radiobutton.click();
			Thread.sleep(4000);

			driver.quit();

		}

	}

}
