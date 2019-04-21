package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDependsOnMethod {

	@Test(priority=1)
	public void BrowserLunch() {
		System.out.println("Thee browser is lunched");
	}
	
	@Test(priority=2,dependsOnMethods="BrowserLunch")
	public void ApplicationLunch() {
		System.out.println("Application is lunched");
		Assert.assertTrue(5!=5);
	}
	@Test(priority=3,dependsOnMethods="ApplicationLunch")
	public void AppLogin() {
		System.out.println("Application is login");
	}
}
