
public class MethodOverriding2 extends MethodOverriding {

	public void basic()
	{
	super.basic();
	System.out.println("basic flow");	
	}


	public static void main(String[] args) {
		
		MethodOverriding2 me=new MethodOverriding2();
		me.basic();
		MethodOverriding me1=new MethodOverriding();
		me1.basic();
		main(4);
		System.out.println(x);	
	}
		
	}


