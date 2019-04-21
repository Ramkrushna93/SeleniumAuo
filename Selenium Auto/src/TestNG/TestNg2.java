package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg2 {

	
	@Test(priority=0,description="The metod m1 is executing")
	public void m1()
	{
		Assert.assertTrue(5==4);
	}
	@Test(priority=1,dependsOnMethods="m1",description="The metod m2 is executing")
	public void m2()
	{
		
	}
	@Test(priority=2,description="The metod m3 is executing")
	public void m3()
	{
		
	}
	
	@Test(priority=3,description="The metod m4 is executing",enabled=false)
	public void m4()
	{
		
	}
	@Test(priority=4,description="The metod m5 is executing")
	public void m5()
	{
		
	}
	
	
	
	
	
}
