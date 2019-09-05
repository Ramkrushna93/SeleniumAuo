package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiffTableOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		WebElement table=driver.findElement(By.xpath("//table[@class=\"dataTable\"]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Total rows size="+rows);
		
		List<WebElement>cols=table.findElements(By.tagName("td"));
		System.out.println("Total cols size="+cols);
		
		for(int i=0; i<rows.size(); i++) {
	List<WebElement> firstrowdata1= rows.get(i).findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[\"+i+1\"]/td[1]"));
	
		String firstname=firstrowdata1.get(i).getText();
		
		List<WebElement> firstrowdata2=rows.get(i).findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[\"+i+1\"]/td[2]"));
		String firstname1=firstrowdata1.get(i).getText();
		
		List<WebElement> firstrowdata3=rows.get(i).findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[\"+i+1\"]/td[3]"));
		String firstname2=firstrowdata1.get(i).getText();
		
		List<WebElement> firstrowdata4=rows.get(i).findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[\"+i+1\"]/td[4]"));
		String firstname3=firstrowdata1.get(i).getText();
		
		List<WebElement> firstrowdata5=rows.get(i).findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[\"+i+1\"]/td[5]"));
		String firstname4=firstrowdata1.get(i).getText();
		
		System.out.println( firstname+"d"+firstname1+"d"+firstname2+"d"+firstname3+"d"+firstname4);
		}
		
		
		
		
	}

}
