
public class Assignment6 {
	public void method1(int x,int y,int z)
	{
		System.out.println("Three parameterized Method");
	}
    public void method2()
	{
		System.out.println("Default Method");
	}
	public void method3(int x)
	{
		System.out.println("One parameterized Method");
	}
	public void method4(int w,int x,int y,int z)
	{
		System.out.println("Four parameterized Method");
	}
	public void method5(int y,int z)
	{
		this.method1(1, 5, 6);
		this.method2();
		this.method3(5);
		this.method4(1, 2, 3, 4);
		System.out.println("Two parameterized Method");
		
	}
	public static void main(String[] args) {
		Assignment6 assign6=new Assignment6();
		assign6.method5(5, 9);
		

	}

}
