package RadioButtonOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllRadioButtonOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		WebElement femaleradiobutton = driver.findElement(By.xpath("//input[@value='1']"));

		femaleradiobutton.click();
		Thread.sleep(4000);

		if (femaleradiobutton.isSelected()) {
			WebElement maleradiobutton = driver.findElement(By.xpath("//input[@value='2']"));

			maleradiobutton.click();
			System.out.println("The maleradiobuttonis selected");

		} else {

			System.out.println("The femaleradiobutton is selected");

		}
	}

}
