package TextBoxOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CharacterSequenceInSendkeysOperations {
	
	
	@Test
	public void characterSendkeysOperation() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		CharSequence charstring=new String("https://");
		CharSequence charstringbuff=new StringBuffer("google.");
		CharSequence charstringbuild=new StringBuilder("com");
		
		driver.findElement(By.name("q")).sendKeys(charstring);
		driver.findElement(By.name("q")).sendKeys(charstringbuff);
		driver.findElement(By.name("q")).sendKeys(charstringbuild);
		
		
	}

}
