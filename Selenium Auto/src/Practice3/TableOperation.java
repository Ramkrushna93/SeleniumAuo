package Practice3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperation {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total rows are"+rows.size());
		
		int Alldata=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td")).size();
		System.out.println(Alldata);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
