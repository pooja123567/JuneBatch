package WebsiteAutomation.WebsiteAutomation;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		String str = "0000000";
		int i=0;
		while(i<str.length() && str.charAt(i)=='0')
		{
			i++;
		}
	String res=(i==str.length())?"0":str.substring(i);
System.out.print(res);
	}

}
