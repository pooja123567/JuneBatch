package Testng;

public class ChildClass3 extends ChildClass4 {
	int a;
	
	public ChildClass3(int a)
	{
		super(a);
      this.a=a;
	}
	
	
	public int increment() {
		a=a+1;
		return a;
		
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
