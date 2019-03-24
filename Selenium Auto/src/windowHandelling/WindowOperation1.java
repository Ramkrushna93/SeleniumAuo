package windowHandelling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOperation1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");

		String parentWindow = driver.getWindowHandle();

		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("The Number of windows is" + allwindows.size());

		Object[] temp = allwindows.toArray();

		for (int i = 0; i < temp.length; i++) {

			String childWindow = temp[i].toString();

			if (!childWindow.equalsIgnoreCase(parentWindow)) {

				driver.switchTo().window(childWindow);

				driver.close();
				driver.switchTo().window(parentWindow);
			}

		}

//		driver.findElement(By.xpath("//a[@title='Employer Login']")).click();

		// Set<String> chd=driver.getWindowHandles();

//		Object[] tmp=chd.toArray();
//		System.out.println("the final window is"+tmp.length);
//		String chw=tmp[1].toString();
//		
//		driver.switchTo().window(chw);
//		
//		System.out.println("the title of the page is"+driver.getCurrentUrl());
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.id("RCBcontactPerson")).sendKeys("Raju kumar");
//		
//		driver.close();
//		driver.switchTo().window(parentWindow);
//		System.out.println("the title of the page "+driver.getCurrentUrl());
//		
//		

//		String childWindow=temp[4].toString();
//		
//		driver.switchTo().window(childWindow);
//		
//		driver.findElement(By.id("RCBcontactPerson")).sendKeys("Raju kumar");
//		
//		
	}

}
