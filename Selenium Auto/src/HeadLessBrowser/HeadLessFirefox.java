package HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFirefox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\geckodriver.exe");
		FirefoxOptions option=new FirefoxOptions();
		option.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
