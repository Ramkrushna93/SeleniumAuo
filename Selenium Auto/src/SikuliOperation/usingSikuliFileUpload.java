package SikuliOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class usingSikuliFileUpload {
	
	@Test
	public void fileUpload() throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.id("imagesrc")).click();
		
		String imagefilepath="C:\\Users\\USER\\Downloads";
		String fileinputpath="C:\\Users\\USER\\Downloads";
		
		
		Screen s=new Screen();
		
		Pattern fileinputtextbox=new Pattern(imagefilepath+"FileInputTextbox");
		Pattern openbutton=new Pattern(imagefilepath+"OpenButton");
		
		Thread.sleep(5000);
		s.wait(fileinputtextbox,20);
		s.type(fileinputtextbox,fileinputpath+"fileupload.jpg");
		s.click(openbutton);
	}

}
