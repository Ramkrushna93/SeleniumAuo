package TextBoxOperation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxFullOperation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement text_box = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		text_box.clear();
		text_box.sendKeys("Mobile");
		String data = text_box.getAttribute("value");
		System.out.println("The entered data  THE TEXT BOX IS" + data);

	}

}
