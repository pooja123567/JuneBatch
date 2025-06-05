package Testng;

import org.testng.annotations.Test;

public class HelperAttribute {
	
	@Test(dependsOnMethods={"dMethod","cMethod"})
	public void aMethod()
	{
		System.out.println("a method");
	}
	@Test
    public void cMethod()
{
	System.out.println("c method");
}
    @Test(timeOut=4000)
    public void dMethod()
{
	System.out.println("d method");
}
    @Test(enabled=false)
	public void bMethod()
	{
		System.out.println("b method");
	
	}
 
}
