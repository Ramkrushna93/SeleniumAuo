package TextBoxOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxFullPOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

		WebElement text_box = driver.findElement(By.xpath("//input[@autocorrect='off'or@name='search_query']"));
		text_box.clear();
		text_box.sendKeys("Song");
		String data = text_box.getAttribute("value");

		System.out.println("the entered data IN TEXT BOX IS" + data);

	}

}
