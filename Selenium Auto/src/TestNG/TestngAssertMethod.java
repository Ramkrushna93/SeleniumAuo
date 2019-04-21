package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestngAssertMethod {
	WebDriver driver;
	@BeforeMethod
	public void LunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

	
	@Test
	public void CatchTitle() throws InterruptedException {
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title,"Google","the title is match" );
		Thread.sleep(3000);
		
		

	}
}
