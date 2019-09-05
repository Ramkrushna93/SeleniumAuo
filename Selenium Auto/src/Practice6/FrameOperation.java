package Practice6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FrameOperation {
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		report = new ExtentReports("./Frame.html");
		test = report.startTest("Driver is Lunched");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Index.html");
		test.log(LogStatus.INFO,"Browser is Lunched");
	}

	@Test
	public void FrameOper() throws InterruptedException {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Index", "Title is not match");
		test.log(LogStatus.INFO,"Title is capture");

		driver.findElement(By.cssSelector("input#email")).sendKeys("RK");
		test.log(LogStatus.PASS,"Enter data to textbox");
		
		driver.findElement(By.cssSelector("img#enterimg")).click();
		test.log(LogStatus.PASS,"Click element prefectly");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']")));
		test.log(LogStatus.PASS,"Pointer move to element");
		act.build().perform();

		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);

		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		Thread.sleep(3000);
		act.click();
		test.log(LogStatus.PASS,"Element is enterd");
		act.build().perform();

	}

}
