package Testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class listenerCheck {
	@Test
	public void listener() {
		System.out.print("listener"+" ");
		Assert.assertTrue(false);
		
	}
@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("before method");
	}
@AfterMethod
public void afterMethod()
{
	System.out.println("after method");
}
}

