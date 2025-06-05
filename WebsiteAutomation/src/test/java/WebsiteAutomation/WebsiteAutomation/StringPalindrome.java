package WebsiteAutomation.WebsiteAutomation;

public class StringPalindrome {

	public static void main(String[] args) {
		/*String s="madamtut";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");	
		}*/
		/*String s="madam";
		String s1=new StringBuilder(s).reverse().toString();
		
		System.out.println(s);
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("palindrome no");
		}
		else
		{
			System.out.println("not palindrome no");
		}
		*/
		int num=13314;
		int original=num;
		int remainder,reversed=0;
		while(num>0)
		{
			remainder=num%10;
			reversed=reversed*10+remainder;
			num=num/10;
			}
if(reversed==original)
{
	System.out.println("palindrome no");
	
}
else
{
	System.out.println("not palindrome no");
}
	}

	
}
