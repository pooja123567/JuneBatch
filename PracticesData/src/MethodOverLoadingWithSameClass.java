
public class MethodOverLoadingWithSameClass {
	public void method1(int x)
	{
		System.out.println("Calling Method 1 with one parameter");
	}
	public void method1(int x,int y)
	{
		
		System.out.println("Calling Method 1 with 2 parameter");
	}
	public void method1(int x,float y)
	{
		
		System.out.println("Calling Method 1 with 2 parameter int and float");
	}
	
	public void method1( float x,int y)
	{
		
		System.out.println("Calling Method 1 with 2 parameter float and int");
		
	}
	public static void main(String args[])
	{
		 MethodOverLoadingWithSameClass mo=new MethodOverLoadingWithSameClass ()	;
		 mo.method1(1);
		 mo.method1(1, 2);
		 mo.method1(4.0f, 1);
		 mo.method1(1, 1.0f);
		 
	}
	


	

}
