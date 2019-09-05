package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperation2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		Thread.sleep(3000);
		WebElement baseTable = driver.findElement(By.tagName("tr"));

		WebElement tableRows = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]"));

		String tableText = tableRows.getText();
		System.out.println("Thired row of the table" + tableText);

		WebElement tablerow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]"));

		String tableData = tablerow.getText();
		System.out.println("The tablerow value is" + tableData);

		driver.close();

	}

}
