package windowHandelling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowUsingItarator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String ParentwindowId = it.next();
		Thread.sleep(3000);
		System.out.println(" parent window id is" + ParentwindowId);

		String ChildwindowId = it.next();
		Thread.sleep(3000);
		System.out.println("Child window Id is" + ChildwindowId);
		driver.switchTo().window(ChildwindowId);

		System.out.println("The Child window pop up url is" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(ParentwindowId);
		System.out.println("The parent window title is" + driver.getTitle());

	}
}
