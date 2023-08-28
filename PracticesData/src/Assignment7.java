
public class Assignment7 {
	public Assignment7(int x,int y,int z)
	{
		System.out.println("Parent three parameterized Constructor");
	}
	public Assignment7()
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	public Assignment7(int x)
	{
		this();
		System.out.println("Parent one parameterized Constructor");
	}
	public Assignment7(int x,int y)
	{
		this(1);
		System.out.println("Parent two parameterized Constructor");
	}

	
}
