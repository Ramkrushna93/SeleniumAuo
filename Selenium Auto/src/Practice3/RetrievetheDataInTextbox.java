package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievetheDataInTextbox {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		
		textbox.sendKeys("selenium");
		List<WebElement> Autosuggestion=textbox.findElements(By.xpath("//ul[@role=\"listbox\"]//li[@role=\"presentation\"]"));
		
		System.out.println("All autosuggestion are"+Autosuggestion.size());
		
		String data=textbox.getAttribute("value");
		
		System.out.println("The value in textbox"+data);
		
		driver.close();
		
		
	}

}
