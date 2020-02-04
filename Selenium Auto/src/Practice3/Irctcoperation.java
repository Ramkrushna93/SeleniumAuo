package Practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Irctcoperation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
	WebElement from=driver.findElement(By.xpath("//input[@placeholder=\"From*\"]"));
		from.sendKeys("Mas");
	//	from.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2000);
		List<WebElement> sugs=from.findElements(By.xpath("//*[@id=\"origin\"]/span/div//li"));
		
		System.out.println("total data"+sugs.size());
		for(int i=0 ; i<sugs.size() ; i++) {
			
			String allsugs=sugs.get(i).getText();
		if (allsugs.contains("CHENNAI CENTRAL - MAS")) {
				System.out.println(allsugs);
			WebElement clk=sugs.get(i);
			 clk.click();
			}}
	WebElement to=driver.findElement(By.xpath("//input[@placeholder=\"To*\"]"));
		to.sendKeys("DELHI");
		Thread.sleep(2000);
			 List<WebElement> sgs=driver.findElements(By.xpath("//*[@id=\"destination\"]/span/div/ul//li"));
			 System.out.println("total data"+sgs.size());
			 Thread.sleep(3000);
			 for(int i=1 ; i<sgs.size(); i++) {
				 String allsgs=sgs.get(i).getText();
				 if (allsgs.contains("NEW DELHI - NDLS")) {
					 System.out.println(allsgs);
					 WebElement sgsclk=sgs.get(i);
						 sgsclk.click();
				 }}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.querySelector('input[placeholder=\"Journey Date(dd-mm-yyyy)*\"]').value='I love u'");
		Thread.sleep(5000);
		
		WebElement seat=driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/label"));
		seat.click();
		
        Thread.sleep(3000);
		List<WebElement> seatsgs=seat.findElements(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul//li"));
		System.out.println("total sga"+seatsgs.size());
		
		for(int i=0 ; i<seatsgs.size();i++) {
			String seatsl=seatsgs.get(i).getText();
			if (seatsl.contains("Sleeper (SL)")) {
			WebElement seatclass=seatsgs.get(i);
			seatclass.click();
			
		Thread.sleep(3000);
		WebElement checkbox=driver.findElement(By.xpath("//*[text()='Flexible With Date']"));
		  checkbox.click();
		  
		  driver.findElement(By.xpath("//button[@label=\"Find Trains\"]")).click();
		
	}
	}
}}
	
		


