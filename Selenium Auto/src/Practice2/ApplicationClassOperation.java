package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ApplicationClassOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//a[@title=\"Contacts\"]")));

		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/ul/li[3]/a"))).click();
		act.perform();
		Thread.sleep(3000);
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='cs_title']")));
		s1.selectByVisibleText("Mr.");

		driver.findElement(By.xpath("//input[@name=\"cs_first_name\"]")).sendKeys("Ram");

		driver.findElement(By.xpath("//input[@name=\"cs_middle_initial\"]")).sendKeys("krushna");

		driver.findElement(By.xpath("//input[@name=\"cs_surname\"]")).sendKeys("Sahoo");
		driver.findElement(By.xpath("//input[@name='cs_company_name']")).sendKeys("TCS Lmt");
		driver.findElement(By.xpath("//input[@name='cs_company_position']")).sendKeys("Software engineer");
		driver.findElement(By.xpath("//input[@name='cs_department']")).sendKeys("Tester");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#fieldId_cs_created_at_from\").value=\"13/Aug/2010\"");

		js.executeScript("document.querySelector(\"#fieldId_cs_created_at_to\").value=\"10/Jan/2018\"");

		Select s2 = new Select(driver.findElement(By.xpath("//select[@name=\"cs_address_type\"]")));
		s2.selectByVisibleText("Billing");

		WebElement checkbox = driver.findElement(By.xpath("//input[@name=\"cs_default_address\"]"));
		checkbox.click();

		driver.findElement(By.xpath("//input[@name=\"cs_city\"]")).sendKeys("Balasore");
		driver.findElement(By.xpath("//input[@name=\"cs_state\"]")).sendKeys("Odisha");
		driver.findElement(By.xpath("//input[@name=\"cs_country\"]")).sendKeys("India");

		Select s3 = new Select(driver.findElement(By.xpath("//select[@name=\"cs_category\"]")));
		s3.selectByValue("Friend");
		Select s4 = new Select(driver.findElement(By.xpath("//select[@name=\"cs_status\"and@class=\"select\"]")));
		s4.selectByValue("New");
		Select s5 = new Select(driver.findElement(By.xpath("//select[@name=\"cs_campaignList\"]")));
		s5.selectByValue("6041");

		driver.findElement(By.xpath("//input[@name=\"cs_mobile\"]")).sendKeys("9668816507");
		driver.findElement(By.xpath("//input[@name=\"cs_email\"]")).sendKeys("raju1221293220@gmail.com");

		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='cs_receive_email'and@value=\"Y\"]"));
		radiobutton.click();

		Select s6 = new Select(driver.findElement(By.xpath("//select[@name='cs_im_netowrk']")));
		s6.selectByValue("Google Talk");

		Select s7 = new Select(driver.findElement(By.xpath("//select[@name='cs_source']")));
		s7.selectByValue("Email");

		Select s8 = new Select(driver.findElement(By.xpath("//select[@name=\"cs_source\"and@class=\"select\"]")));
		s8.selectByVisibleText("Web Service");

		js.executeScript("document.querySelector(\"#fieldId_cs_birthday\").value=\"10/Aug/2018\"");

		js.executeScript("document.querySelector(\"#fieldId_cs_birthday_to\").value=\"25/Feb/2018\"");

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@name=\"cs_search_extended\"]"));
		checkbox2.click();

		Thread.sleep(600000);

		driver.quit();

	}

}
