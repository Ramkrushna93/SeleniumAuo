package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		ExtentReports reports = new ExtentReports("./raju.html");
		ExtentTest test = reports.startTest("This is report");

		driver.get("http://www.facebook.com");
		test.log(LogStatus.INFO, "Info of event");
		driver.findElement(By.name("email")).sendKeys("");
		test.log(LogStatus.PASS, "The email is entered");
		driver.findElement(By.name("pass")).sendKeys("");
		test.log(LogStatus.PASS, "The password is entered");

		reports.endTest(test);
		reports.flush();

	}

}
