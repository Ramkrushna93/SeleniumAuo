package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCmrOperation {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("username")).sendKeys("raju1221293220");
		driver.findElement(By.name("password")).sendKeys("Lichi1993");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	}
	@Test
	public void Operation() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("«Shortlist")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("leftpanel");
		Select s1=new Select(driver.findElement(By.name("doaction")));
		      s1.selectByVisibleText("Change Ownership");
		
		List<WebElement>datalist=driver.findElements(By.tagName("option"));
		System.out.println(datalist.size());
		
		List<WebElement> dataname=s1.getOptions();
		
		for(int i=0; i<dataname.size(); i++) {
		String listname=dataname.get(i).getText();
		System.out.println("Total listname are"+listname);
		}
		driver.findElement(By.className("button")).click();
		
		
	driver.switchTo().defaultContent();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("Quick Create»")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("company_name")).sendKeys("fqugkjch");
		driver.findElement(By.name("contact_first_name")).sendKeys("jwegiuh9uu");
		driver.findElement(By.linkText("Close")).click();
	}

}
