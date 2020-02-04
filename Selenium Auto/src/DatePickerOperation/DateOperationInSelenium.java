package DatePickerOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOperationInSelenium {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("raju1221293220");
		
		driver.findElement(By.name("password")).sendKeys("Lichi1993");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		driver.switchTo().frame("mainpanel");
		String dateval="13-september-2018";
		String date[]=dateval.split("-");
		String day=date[0];
		String month=date[1];
		String year=date[2];
		
		Select s1=new Select(driver.findElement(By.xpath("slctMonth")));
		s1.selectByVisibleText(month);
		
		Select s2=new Select(driver.findElement(By.xpath("slctYear")));
		s2.selectByVisibleText(year);
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		
		
		
	}

}
