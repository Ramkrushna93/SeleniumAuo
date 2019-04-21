package TestNG;

import org.testng.annotations.Test;

public class TestngInvocationCounts {
	
	@Test(priority=1 ,invocationCount=5)
	public void Login() {
		
		System.out.println("The Application is login");
	}
	@Test(priority=2,invocationCount=6)
	public void LogOut() {
		System.out.println("The application is logout");
	}


	
	
	
	
	
}
