package WebsiteAutomation.WebsiteAutomation;

public class StringImmutable {

	public static void main(String[] args) {
	String s="hello world";
	s.concat("data");
	System.out.println(s);
	s.concat("data");
	System.out.println(s);
	
	StringBuilder s1=new StringBuilder("Hello kitty");
	s1.append("data");
	System.out.println(s1);
	}

}
