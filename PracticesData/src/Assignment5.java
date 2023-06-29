
public class Assignment5 {
	
	public  Assignment5 (int x,int y,int z)
	{
		System.out.println("Three parameterized Constructor");
	}
	public  Assignment5 ()
	{
		this(7,8,9);
		System.out.println("Default Constructor");
	}
	public  Assignment5 (int x)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public  Assignment5(int w,int x,int y,int z)
	{
		this(2);
		System.out.println("Four parameterized constructor");
	}
	public  Assignment5 (int x,int y)
	{
		this(1,2,3,4);
		System.out.println("Two parameterized Constructor");
	}
	public static void main(String[] args) {
		Assignment5 assign= new Assignment5(2,3);
		}
}
