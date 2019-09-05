package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcOperation {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement datasend=driver.findElement(By.xpath("//input[@placeholder=\"From*\"]"));		
		datasend.sendKeys("Chennai");
		
		Thread.sleep(3000);
		List<WebElement> sgs=datasend.findElements(By.xpath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-star-inserted\"]/li/span"));
		System.out.println("Total auto sugesstions are="+sgs.size());
		
		for(int i=0; i<sgs.size(); i++) {
			String sgsname=sgs.get(i).getText();
			System.out.println("All sgs name are="+sgsname);
			
			if (sgsname.contains("CHENNAI CENTRAL - MAS")) {
				sgs.get(i).click();
				
		WebElement data=driver.findElement(By.xpath("//label[@class=\"ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted\"]"));
		data.click();		
		List<WebElement> allsgs=data.findElements(By.xpath("//ul[@class=\"ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c13-7 ng-star-inserted\"]/li/span"));
		System.out.println("Total sgs are="+allsgs.size());
		
		for(int j=0; j<allsgs.size(); j++) {
			
			String sgsdataname=allsgs.get(j).getText();
			System.out.println("Total sgs data name are="+sgsdataname);
			
			if (sgsdataname.contains("First Class (FC)")) {
				allsgs.get(j).click();
				
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('input[placeholder=\"Journey Date(dd-mm-yyyy)*\"]').value='20-01-2020'");
			
				
			}
			
		}
		
			}
		
		}
		
	}

}
