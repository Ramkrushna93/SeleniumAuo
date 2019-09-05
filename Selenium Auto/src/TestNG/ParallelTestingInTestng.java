package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingInTestng {
	public WebDriver driver=null;
  @Test
  public void lunchBrowser() {
	  System.out.println("Lunch Browser id is ="+Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void lunchBrowser1() {
	  System.out.println("Lunch browser1 id is="+Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://www.gmail.com");
	  
  }

}
