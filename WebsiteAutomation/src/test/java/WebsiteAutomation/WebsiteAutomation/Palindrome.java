package WebsiteAutomation.WebsiteAutomation;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
	
		char  ch=s.charAt(i);
      s1=s1.concat(String.valueOf(ch)) ;
	}
		if(s.equalsIgnoreCase(s1))
		{
			System.out.print("palindrome");
			
		}
		else
		{
			System.out.print("not palindrome");
		}

	}

}
