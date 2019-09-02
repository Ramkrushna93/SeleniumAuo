package ExtentReportGeneration;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportGeneration1 {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test; 
	
	@BeforeMethod
	public void SetUp() {
		report=new ExtentReports("C:\\Users\\USER\\eclipse-workspace\\selenium\\test-output\\MyExtentReport");
		report.addSystemInfo("Host name","Localhost");
		report.addSystemInfo("Environment", "QA");
		report.addSystemInfo("user","Raju");
		report.loadConfig(new File(System.getProperty("C:\\Users\\USER\\eclipse-workspace\\selenium\\extent-config.xml")));
		test=report.startTest("Generate Repot");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Driver is opened");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		test.log(LogStatus.INFO,"url Lunched");
	}
	@Test
	public void valifyTitle() {
		
		String title= driver.getTitle();
		Assert.assertEquals(title, "jgkdddhikfj");
		test.log(LogStatus.PASS,"Title Captureed");
		
	}
	@Test
	public void valueSend() {
		
		driver.findElement(By.name("firstname")).sendKeys("Raju");
		test.log(LogStatus.PASS,"Data send to textbox");
	}
	
	@Test
	public void checkBoxClick() {
		driver.findElement(By.xpath("//*[text()=\"Male\"]")).click();
		test.log(LogStatus.PASS, "Clicked on radiobuttn");
		
		report.endTest(test);
	    report.flush();
	}

}
