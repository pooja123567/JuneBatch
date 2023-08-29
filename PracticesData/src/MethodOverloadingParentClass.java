
public class MethodOverloadingParentClass {
	public void method1()
	{
		System.out.println("default method calling");
	}
	public void method1(int x)
	{
		System.out.println("Method with 1 parameter calling");
	}
	
	public void method1(int x ,int y)
	{
		System.out.println("Method with 2 parameter calling");
	}
}
