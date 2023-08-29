
public class ChildClass1 extends Assignment7 {
	public ChildClass1(int x,int y,int z)
	{
		this();
		System.out.println("Child three parameterized Constructor");
	}
	public ChildClass1  ()
	{
		super(1,2);
		System.out.println("Child Default Constructor");
	}
	public ChildClass1 (int x)
	{
		this(1,2,3);
		System.out.println("Child one parameterized Constructor");
	}
	public ChildClass1(int x,int y)
	{
		this(1);
		System.out.println("Child two parameterized Constructor");
	}

	public static void main(String[] args) {
		ChildClass1 c1=new ChildClass1(2,4);
		
	}

}
