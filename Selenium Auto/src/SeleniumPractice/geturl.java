package SeleniumPractice;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class geturl extends TextBoxOperation {
	
	@Test
	public void geturl() {
	String url=	driver.getCurrentUrl();
	System.out.println(url);
	
	String title=driver.getTitle();
	System.out.println(title);
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
	geturl gu=new geturl();
	gu.Setup();
	gu.DataSend();
	gu.geturl();
	}
}
