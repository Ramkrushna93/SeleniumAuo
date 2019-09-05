package Practice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MoveOneToAnotherFrame {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("");
	}

}
