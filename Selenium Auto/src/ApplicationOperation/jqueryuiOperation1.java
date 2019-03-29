package ApplicationOperation;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryuiOperation1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/");
		Thread.sleep(4000);
		WebElement link = driver.findElement(By.linkText("Droppable"));
		link.click();

		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement dragloc = driver.findElement(By.id("draggable"));
		WebElement droploc = driver.findElement(By.id("droppable"));

		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.dragAndDrop(dragloc, droploc);
		act.build().perform();

		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();
		driver.switchTo().frame(0);
//		WebElement dragloc1=driver.findElement(By.id("draggable"));
//		droploc=driver.findElement(By.id("droppable"));
//		act.dragAndDrop(dragloc1, droploc);
//        act.build().perform();
//		
		Thread.sleep(3000);
		WebElement dragloc2 = driver.findElement(By.id("draggable-nonvalid"));
		droploc = driver.findElement(By.id("droppable"));
		act.dragAndDrop(dragloc2, droploc);
		act.build().perform();

		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Prevent propagation")).click();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement dragloc3 = driver.findElement(By.id("draggable"));
		droploc = driver.findElement(By.id("droppable-inner"));
		act.dragAndDrop(dragloc3, droploc);
		act.build().perform();

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Revert draggable position")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement dragloc4 = driver.findElement(By.id("draggable"));
		droploc = driver.findElement(By.id("droppable"));
		act.dragAndDrop(dragloc4, droploc);
		act.build().perform();

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Simple photo manager")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement dragloc5 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		droploc = driver.findElement(By.id("trash"));
		act.dragAndDrop(dragloc5, droploc);
		act.build().perform();
		Thread.sleep(3000);
		dragloc5 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		droploc = driver.findElement(By.id("trash"));
		act.dragAndDrop(dragloc5, droploc);
		act.build().perform();

	}

}
