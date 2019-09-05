package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallTableContains {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");

		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

		List<WebElement> rows, colms;

		rows = table.findElements(By.tagName("tr"));
		int i = 0;
		for (int j = 0; j < rows.size() - 1; j++) {

			String colm1 = rows.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[\"+i+\"]/td[1]/a"))
					.getText();
			String colm2 = rows.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[\"+i+\"]/td[2]"))
					.getText();
			String colm3 = rows.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[\"+i+\"]/td[3]"))
					.getText();
			String colm4 = rows.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[\"+i+\"]/td[4]"))
					.getText();
			String colm5 = rows.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[\"+i+\"]/td[5]"))
					.getText();
			System.out.println(colm1 + "\t " + colm2 + " \t" + colm3 + " \t" + colm4 + " \t" + colm5);
			i++;

		}
	}

}
