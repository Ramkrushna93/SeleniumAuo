package TextBoxOperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToFindAlltextBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");

		driver.findElement(By.xpath("//*[@id=\"txtuId\"]")).sendKeys("raju");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();

		alt.accept();
		alt.getText();

	}

}
