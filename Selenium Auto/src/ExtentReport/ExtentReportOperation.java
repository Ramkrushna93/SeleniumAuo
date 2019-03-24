package ExtentReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportOperation {
	@Test
	public void test() {
		ExtentReports report = new ExtentReports("./raju.html");
		ExtentTest test = report.startTest("The driver is lunch");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");
		test.log(LogStatus.INFO, "The application is lunch");

		driver.findElement(By.id("identifierId")).sendKeys("");
		test.log(LogStatus.INFO, "username is entered");

		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "The key is entered");

		driver.findElement(By.name("password")).sendKeys("");
		test.log(LogStatus.PASS, "password is entered");

		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "key is entered");

		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")).click();
		test.log(LogStatus.PASS, "The button is pressed");

		driver.findElement(By.xpath("//a[text()=\"Sign out\"]")).click();
		test.log(LogStatus.PASS, "The signout clicked");

		report.endTest(test);
		report.flush();

	}

}
