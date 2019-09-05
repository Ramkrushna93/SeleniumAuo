package Practice3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement data = driver.findElement(By.xpath("//button[@onclick=\"pushConfirm()\"]"));
		data.click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		String alertmsg = alt.getText();
		System.out.println(alertmsg);
		alt.accept();

	}

}
