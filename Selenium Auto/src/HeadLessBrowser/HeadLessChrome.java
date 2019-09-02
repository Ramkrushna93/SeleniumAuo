package HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
	}

}
