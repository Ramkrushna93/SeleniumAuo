package ExtentReportGeneration;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.testng.ITestResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PomFacebookDemoTest  {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	PomOperationOnFacebook facebookreg=new PomOperationOnFacebook(driver);
	@BeforeTest
	public void SetUp() {
		report=new ExtentReports("C:\\Users\\USER\\eclipse-workspace\\selenium\\test-output\\MyExtentReport");
		report.addSystemInfo("Hostname","LocalHost");
		report.addSystemInfo("Environment","QA");
		report.addSystemInfo("UserName", "Raju");
		report.loadConfig(new File(System.getProperty("C:\\Users\\USER\\eclipse-workspace\\selenium\\extent-config.xml")));
		test=report.startTest("Generate report");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Driver Lunched");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		test.log(LogStatus.INFO,"Url Lunched");
	}
	@Test
	public void VerifyTitle() {
		String title=facebookreg.ValidateTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		test.log(LogStatus.PASS, "Capture Page Title");
		report.endTest(test);
		report.flush();
		
	}
//     @Test
//     public void NameSend() {
//	 	facebookreg.FirstName("Raju");
//	 	test.log(LogStatus.PASS,"Firstname is entered");
//		facebookreg.Surename("Sahoo");
//		test.log(LogStatus.PASS,"Surename is entered");
//		Assert.assertEquals(true, true);
//		test.log(LogStatus.PASS,"Assert pass Condition is true");
//     }
//      @Test
//      public void SendMail() {
//		facebookreg.Email("rk@gmail.com");
//		test.log(LogStatus.PASS,"Entered email id");
//		facebookreg.RegPassword("raju1234");
//		test.log(LogStatus.PASS,"Entered regpassword");
//		Assert.assertEquals(true, true);
//		test.log(LogStatus.PASS,"Assert pass condition is true");
//      }
//      @Test
//      public void BirthDataSend() {
//		facebookreg.BirthDate();
//		test.log(LogStatus.PASS,"BirthDate is Selected");
//		facebookreg.BirthMonth();
//		test.log(LogStatus.PASS,"BirthMonth is Selected");
//		facebookreg.BirthYear();
//		test.log(LogStatus.PASS,"BirthYear is Selected");
//		facebookreg.Gender();
//		test.log(LogStatus.PASS,"Gender is Selected");
//		Assert.assertEquals(true, true);
//		test.log(LogStatus.PASS,"Assert pass Condition is true");
//      }
	
//	@AfterMethod
//	public void TearDown() {
//		
//		driver.close();
//	}
//	

}
