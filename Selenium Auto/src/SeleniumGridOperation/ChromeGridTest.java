package SeleniumGridOperation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {
	
	public  static void main(String[] args) throws MalformedURLException {
		
	//For creating hub in command promt command  type or pastr command on command promt
		
		// java -jar selenium-server-standalone-3.141.59.jar  -role hub
		
		// For  close hub in command promt type
		// Ctrl C
		
		
		//For creating node in command promt  type or pastr command on command promt
		
		// java -Dwebdriver.chrome.driver="C:\Users\USER\eclipse-workspace\selenium\lib\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.1.4:4444/grid/register

		//// For  close node in command promt type
		// Ctrl C
		
		
		
		// Define desiredCapablity cap
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.VISTA);
		
		// Chrome Options definations
		
		ChromeOptions option=new ChromeOptions();
		option.merge(cap);
		
		String hubUrl=" http://192.168.1.4:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl),option);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	//	driver.quit();
	}

}
