package PageObjectModelOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomFacebookDemoTest  {
	
	@Test
	public void RegistationFacebook() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		PomOperationOnFacebook facebookreg=new PomOperationOnFacebook(driver);
		driver.get("https://www.facebook.com/");

		facebookreg.FirstName("Raju");
		facebookreg.Surename("Sahoo");
		facebookreg.Email("rk@gmail.com");
		facebookreg.RegPassword("raju1234");
		facebookreg.BirthDate();
		facebookreg.BirthMonth();
		facebookreg.BirthYear();
		facebookreg.Gender();
		
	// validation
		if(driver.getPageSource().contains("Thank you for registering")) { 
			System.out.println("Your Registation Sucessfully Completed");
		
		}else { 
		System.out.println("Your Registation not Sucessfully Completed");
		}
	}	
//	@AfterTest
//	public void TearDown() {
//		driver.close();
//	}
//	

}
