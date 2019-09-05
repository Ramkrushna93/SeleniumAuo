package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveValueInTextBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));

		TextBox.sendKeys("java");
		Thread.sleep(3000);
		String data = TextBox.getAttribute("value");

		System.out.println("Data in the textbox" + data);

		driver.close();

	}

}
