package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOperation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Practice\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		WebElement radio=driver.findElement(By.xpath("//*[text()=\"Male\"]"));
//		if (!radio.isSelected()) {
//			radio.click();
//			System.out.println("The radio button is clicked");
//		} else {
//
//			System.out.println("The radio button is not clicked");
//		}
		
		List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("The total radiobutton are="+radiobuttons.size());
		
		for(int i=0; i<radiobuttons.size(); i++) {
			String radioname=radiobuttons.get(i).getText();
			System.out.println("The radiobutton are="+radioname);
		}
	}

}
