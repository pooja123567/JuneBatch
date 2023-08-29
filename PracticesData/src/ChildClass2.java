
public class ChildClass2 extends Assignment8{
	public void m3(int x,int y,int z)
	{
		
		System.out.println("Child three parameterized Method");
	}
	public void m0 ()
	{
		
		System.out.println("Child Default Method");
	}
	public void m1(int x)
	{
		super.method3(5,6,7);
		super.method();
		super.method1(2);
		super.method2(3,4);
		this.m2(1,2);
		 this.m0();
		this.m3(1,2,3);
		 System.out.println("Child one parameterized Method");
	}
	public void m2(int x,int y)
	{
		
		System.out.println("Child two parameterized Method");
	}

	public static void main(String[] args) {
		ChildClass2 c2=new ChildClass2();
		c2.m1(1);
		
	}

}
