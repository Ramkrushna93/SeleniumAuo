package Practice5;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class variousAppExecutionOperation {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	@BeforeMethod
	public void setUp() {
		report = new ExtentReports("./rk.html");
		test = report.startTest("Driver is lunch");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);

		 driver.get("https://www.amazon.com/");
		 test.log(LogStatus.INFO, "Amazon application is lunch");
	}


	@Test(priority = 1)
	public void dropDownHandles() {
		Select s1 = new Select(driver.findElement(By.id("searchDropdownBox")));

		s1.selectByVisibleText("Industrial & Scientific");
		test.log(LogStatus.PASS, "DropDown data is selected");

		List<WebElement> elements = s1.getOptions();
		System.out.println("Total element in the dropdown are=" + elements.size());
		test.log(LogStatus.INFO, "DropDown all elements list");

		for (int i = 0; i < elements.size(); i++) {
			String allvaluename = elements.get(i).getText();

			System.out.println(allvaluename);
			test.log(LogStatus.PASS, " DropDown all elements name");
		}
	}

	@Test(priority = 2)
	public void ActionsClass() throws InterruptedException {
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Departments')]")));
		act.build().perform();
		test.log(LogStatus.PASS, "The pointer is moving to select element");

		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Digital Music')]"))).click();
		act.build().perform();
		test.log(LogStatus.PASS, "The pointer is moving to selecte element");
	}

	@Test(priority = 3)
	public void naukriOperation() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();
		driver.get("https://www.naukri.com/");
		test.log(LogStatus.INFO, "Url is lunched");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Services')]")));
		test.log(LogStatus.PASS, "The pointer  is movig to select element");
		softassert.assertEquals(true, true);

		act.build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'IT & Telecom')])[1]"))).click();
		act.build().perform();
		test.log(LogStatus.PASS, "Pointer is moving and click the element");
		softassert.assertEquals(true, true);

		String parentwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		test.log(LogStatus.INFO, "Total no of windows");
		softassert.assertEquals(true, true);

		Object[] wins = windows.toArray();
		String win = wins[1].toString();
		driver.switchTo().window(win);
		test.log(LogStatus.PASS, "window is sucessfully move to another window");
		String title = driver.getTitle();
		softassert.assertEquals(title, "IT & Telecom Online Courses Certification | Naukri Learning",
				"The title of the page is incorrect");

		Thread.sleep(3000);
		int linksofpage = driver.findElements(By.tagName("a")).size();
		System.out.println("Total no of links in page" + linksofpage);
		test.log(LogStatus.INFO, "Total no of links in page");
		softassert.assertEquals(true, true);
		
		List<WebElement> allcheckboxs=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("Total no of checkboxs in page"+allcheckboxs.size());
		test.log(LogStatus.INFO,"Total no of checkboxs in page");
		softassert.assertEquals(true, true);
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()=\"Companies\"]")));
		act.build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Interview Questions')]")));
		act.click();
		act.build().perform();
		test.log(LogStatus.PASS, "Element clicked");
		softassert.assertEquals(true, true);
		softassert.assertAll();
		
			}
	@Test(priority = 4)
	public void airIndiaOperation() throws InterruptedException {
		driver.get("http://www.airindia.in/");

		driver.findElement(By.xpath("//a[contains(text(),'Book Flight')]")).click();
		test.log(LogStatus.PASS, "element is clicked");
        
		WebElement sendvalue = driver.findElement(By.id("from"));
		sendvalue.sendKeys("che");
		test.log(LogStatus.PASS, "Data send to textbox");
        
		List<WebElement> fromallsgs = sendvalue.findElements(By.xpath("//ul[@id=\"ui-id-2\"]//li[@role=\"presentation\"]/a"));
		System.out.println("Total no of sgs data=" + fromallsgs.size());
		
		for (int i = 0; i < fromallsgs.size(); i++) {
			String fromalldataname = fromallsgs.get(i).getText();

			if (fromalldataname.equalsIgnoreCase("Chennai, Chennai International Airport, MAA, India")) {
			}else {
				System.out.println("The element is not found");

				fromallsgs.get(i).click();
				test.log(LogStatus.PASS, "The element is clicked");
			}
			
			WebElement sendvalue1 = driver.findElement(By.id("to"));
			sendvalue1.sendKeys("kol");
			test.log(LogStatus.PASS, "text send to textbox");
            
			List<WebElement> toallsgs = sendvalue1.findElements(By.xpath("//ul[@id=\"ui-id-3\"]//li[@role=\"presentation\"]/a"));
			System.out.println("Total no of sgs data=" + toallsgs.size());

			for (int j = 0; j < toallsgs.size(); j++) {
				String toallsgsname = toallsgs.get(i).getText();

				if (toallsgsname.contains("Kolkata, Netaji Subhash Chandra Bose International Airport, CCU, India")) {
				}else {
					System.out.println("Ghe element is not found");
					toallsgs.get(i).click();

				}
				

			}

		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
