package FindBrokenLinksInWebPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HowToFindBrokenLink {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		ExtentReports reports=new ExtentReports("./raju.html");
		ExtentTest  test=reports.startTest("This is report");
		//for dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
//		driver.findElement(By.name("username")).sendKeys("raju1221293220");
//		driver.findElement(By.name("password")).sendKeys("Lichi1993");
//		test.log(LogStatus.PASS, "The password  is pass");
//		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//		driver.switchTo().frame("mainpanel");
//		
		//get list all links and images in the page
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		alllinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total links in page"+alllinks.size());
		
		List<WebElement> activelinks=new ArrayList<WebElement>(); //for store in array list
		
		for(int i=0; i<alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getAttribute("href"));
			
			//Include only href attribute links and exclude other links.And Exclude javascript links also
			if (alllinks.get(i).getAttribute("href")!=null && (!alllinks.get(i).getAttribute("href").contains("javascript"))){
				activelinks.add(alllinks.get(i));
	         }}
		//for get size of all activelinks
		System.out.println("Total active links are"+activelinks.size());
		
		//for check the href url with httpconnection api,
		for (int j = 0; j < activelinks.size(); j++) {
			
		HttpURLConnection connection= (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
		String respond=	connection.getResponseMessage(); // for url is ok or not
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"---->"+respond);
			
			
			
			test.log(LogStatus.PASS, "The login is pass");
			reports.endTest(test);
			reports.flush();
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
