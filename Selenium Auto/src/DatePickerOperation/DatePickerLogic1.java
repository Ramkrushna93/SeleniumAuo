package DatePickerOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerLogic1 {
	
	public static void main(String[] args) {
		
		String month="October 2018";
		String date="25";
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		
		driver.findElement(By.name("checkin")).click();
		
		while (true) {
		String textdata=driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
		System.out.println(textdata);
		
		if(month.equals(textdata)) {
			break;
		}
		else
		{
			driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[3]")).click();
		}
			
		}
		
		driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody[1]/tr/td[contains(text(),"+date+")]")).click();
	
	}

}