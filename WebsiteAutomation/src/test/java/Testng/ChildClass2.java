package Testng;

import org.testng.annotations.Test;

public class ChildClass2 {
	
	@Test
	public void childClass2()
	{
		ChildClass3 cc=new ChildClass3(8);
		int a=cc.increment();
	int b=cc.decrement();
	int c=cc.multiply();
	System.out.println(a+" "+b+" "+c);
	//ChildClass4  cc4=new ChildClass4(7);
	//int c=cc4.multiply();
	//System.out.println(c);
	
	}
	

}
