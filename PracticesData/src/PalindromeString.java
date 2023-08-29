
public class PalindromeString {

	public static void main(String[] args) {
		String s="madam";
		String s2="";
	int l=s.length();
	for(int i=l;i>=0;i--)
	{
		Character ch=s.charAt(i);
	String s1=ch.toString();
		s2.concat(s1);
	
	}
	if(s.equals(s2))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not Palindrome");
	}

	}

}
