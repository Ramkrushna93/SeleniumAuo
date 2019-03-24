package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGenerateText {

	@Test
	public void test1() throws InterruptedException, IOException {

		ExtentReports reports = new ExtentReports("./minakshi.html");

		ExtentTest test = reports.startTest("The Login application started");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com");

		test.log(LogStatus.INFO, "Facebook application is lunched");

		driver.findElement(By.id("email")).sendKeys("");

		test.log(LogStatus.INFO, "The User name is entered");

		driver.findElement(By.id("pass")).sendKeys("");

		test.log(LogStatus.INFO, "The password is entered");

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		test.log(LogStatus.PASS, "The login button is clicked");

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("./raju.png"));

		String data = test.addBase64ScreenShot("./raju.png");

		test.log(LogStatus.PASS, "screen shot is added", data);

		Thread.sleep(3600);
		test.log(LogStatus.PASS, "waiting for time is sucessfull");

		reports.endTest(test);
		reports.flush();
	}

}
