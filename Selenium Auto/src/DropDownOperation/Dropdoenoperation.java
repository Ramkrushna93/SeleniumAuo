package DropDownOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdoenoperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Select s1 = new Select(driver.findElement(By.xpath("//select[@aria-label='Day']")));
		s1.selectByValue("13");

		Select s2 = new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
		s2.selectByVisibleText("Nov");

		List<WebElement> alloption = s1.getOptions();

		List<WebElement> alloption1 = s2.getOptions();

		for (int i = 0; i < alloption.size(); i++) {

			String data = alloption.get(i).getText();
			System.out.println("Thr data is" + data);

			for (int i1 = 0; i1 < alloption.size(); i1++) {
				String data1 = alloption1.get(i).getText();
				System.out.println("The data is" + data1);
			}
		}

	}

}
