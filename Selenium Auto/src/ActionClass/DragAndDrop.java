package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		Actions act = new Actions(driver);

		WebElement dragloc = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));

		WebElement droploc = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
//		Thread.sleep(3000);

		act.dragAndDrop(dragloc, droploc);

		act.build().perform();
	}

}
