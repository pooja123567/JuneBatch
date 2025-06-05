package WebsiteAutomation.WebsiteAutomation;

public class RemoveAllWhiteSpaces {
	public static void main(String[] args) {
		String s="  Hello World! How are you?  ";
	String[]s1=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		System.out.print(s1[i]);
	}
}
}
