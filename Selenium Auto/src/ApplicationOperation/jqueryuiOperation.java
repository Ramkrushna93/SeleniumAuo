package ApplicationOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryuiOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/demos/");
		driver.findElement(By.linkText("Droppable")).click();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		Thread.sleep(3000);
		driver.switchTo().frame(0);

		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.build().perform();
		WebElement dragloc = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement droploc = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(3000);
		act.build().perform();
		act.dragAndDrop(dragloc, droploc);
		act.build().perform();

	}

}
