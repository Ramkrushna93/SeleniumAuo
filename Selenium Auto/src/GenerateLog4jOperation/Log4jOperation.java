package GenerateLog4jOperation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Log4jOperation  {
	WebDriver driver;
	Logger logger;
	@Test
	public void RegistationFacebook() {
		 logger=Logger.getLogger("Log4jOperation");
		PropertyConfigurator.configure("log4j.xml");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("Browser opened");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		PomOperationOnFacebook facebookreg=new PomOperationOnFacebook(driver);
		
		driver.get("https://www.facebook.com/");
		logger.info("Url Lunched");

		facebookreg.FirstName("Raju");
		logger.info("Firstname Entered");
		facebookreg.Surename("Sahoo");
		logger.info("Surename Entered");
		facebookreg.Email("rk@gmail.com");
		logger.info("Email Entered");
		facebookreg.RegPassword("raju1234");
		logger.info("RegnPassword Entered");
		facebookreg.BirthDate();
		logger.info("BirthDate is Selected");
		facebookreg.BirthMonth();
		logger.info("BirthMonth is Selected");
		facebookreg.BirthYear();
		logger.info("BirthYear is Selected");
		facebookreg.Gender();
		logger.info("Gender is Selected");
		
	// validation
		if(driver.getPageSource().contains("Thank you for registering")) { 
			System.out.println("Your Registation Sucessfully Completed");
			logger.info("Registation is Sucessfully Completed");
		
		}else { 
		System.out.println("Your Registation not Sucessfully Completed");
		logger.info("Registation not Completed");
		}
	}	
	@AfterTest
	public void TearDown() {
		logger.info("Exit Test");
		
		driver.close();
	}
	

}
