package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeOperation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.youtube.com/");
		
		WebElement textbox=driver.findElement(By.id("search"));
		textbox.sendKeys("song");
		
		WebElement text=textbox.findElement(By.id("search-icon-legacy"));
		text.click();
		Thread.sleep(4000);

		WebElement song=text.findElement(By.xpath("//*[@id=\"video-title\"and@href=\"/watch?v=TRa9IMvccjg\"]"));
		song.click();
		Thread.sleep(40000);
	//	WebElement songs=song.findElement(By.xpath("//div[text()='Skip Ad']"));
	//	songs.click();
		Thread.sleep(20000);
		WebElement play=song.findElement(By.xpath("//button[@class=\"ytp-play-button ytp-button\"]"));
		play.click();
		Thread.sleep(200000);
		play.click();
		Thread.sleep(200000);
		play.click();
	}

}
