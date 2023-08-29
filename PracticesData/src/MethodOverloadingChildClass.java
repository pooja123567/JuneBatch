
public class MethodOverloadingChildClass extends MethodOverloadingParentClass{

	public static void main(String[] args) {
		
		MethodOverloadingChildClass mc=new MethodOverloadingChildClass();
		mc.method1();
		mc.method1(1);
		mc.method1(1, 2);
	}

}
