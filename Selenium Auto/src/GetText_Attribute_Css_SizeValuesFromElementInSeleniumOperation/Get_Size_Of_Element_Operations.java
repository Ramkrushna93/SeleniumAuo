package GetText_Attribute_Css_SizeValuesFromElementInSeleniumOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_Size_Of_Element_Operations {

	// getSize() method in selenium webdriver determines the size of an element;
	// size consists of two values
	// width and height which are the sum of respective attributes

//	@parameters : accepts nothing
	// @return : Dimension class

	@Test(priority = 1)
	public void getElementSize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");

		Dimension elementsize = driver.findElement(By.xpath("//input[@type=\"email\"and@id=\"exampleInputEmail1\"]"))
				.getSize();

		System.out.println("The Element dimension is" + elementsize);

	}

	// getSize() method returns Dimension class object, which has constants like
	// height and width,
	// and methods like getHeight(),getWidth(), using those methods and constants we
	// can get the required property either height or width.

	@Test(priority = 2)
	public void getHeightWidth() {
		// set chrome driver exe path
		System.setProperty("webdriver.chrome.driver", "C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		// fetches text from the element and stores it in text
		Dimension size = driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).getSize();

		System.out.println("Size of the button : " + size);

		System.out.println("Width of the button with constant : " + size.width);
		System.out.println("Height of the button with constant : " + size.height);
		System.out.println("Width of the button with method: " + size.getWidth());
		System.out.println("Height of the button with method: " + size.getHeight());
	}

}
