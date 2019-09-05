package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));

		textBox.sendKeys("mobile");
		Thread.sleep(3000);
		String textdata = textBox.getAttribute("value");
		System.out.println("The data in textBox of flipkart" + textdata);
	}

}
