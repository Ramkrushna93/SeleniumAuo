package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementInDropDown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		
	Select s2=new Select(driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]")));
	s2.selectByValue("USD");
		
		
		List<WebElement> alloptions=s2.getOptions();
		
		for(int i=0 ; i<alloptions.size() ; i++) {
			
			String data=alloptions.get(i).getText();
		
		System.out.println("Total data are"+data);
		}
		
		
	}

}
