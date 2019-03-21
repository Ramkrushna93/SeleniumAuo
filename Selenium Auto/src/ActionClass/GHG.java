package ActionClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GHG extends gg {

	@Test
	public void login() {
		driver.findElement(By.id("segs")).sendKeys("");
		driver.findElement(By.id("sdgsdn")).sendKeys("");
		driver.findElement(By.xpath("//*[id='k']")).click();
	}
}
