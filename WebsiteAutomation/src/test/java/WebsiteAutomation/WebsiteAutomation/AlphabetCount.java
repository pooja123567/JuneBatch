package WebsiteAutomation.WebsiteAutomation;

public class AlphabetCount {

	public static void main(String[] args) {
	String s="pooja1234";
int count=0;
	for(int i=0;i<s.length();i++)
	{
	char ch1=s.charAt(i);
	if(Character.isDigit(ch1))
	{
		count++;
	}
	}
System.out.println(count);
	}

}
