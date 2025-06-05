package Testng;

import org.testng.annotations.Test;

public class OneMoreClass {
	@Test
	public void Demo2()
	{
		System.out.println("second data");
	}
	@Test(groups= {"groupData"})
public void groupData4()
{
	System.out.println("group data 4");
}
}
