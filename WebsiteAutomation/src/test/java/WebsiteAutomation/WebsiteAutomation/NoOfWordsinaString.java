package WebsiteAutomation.WebsiteAutomation;

public class NoOfWordsinaString {

	public static void main(String[] args) {
		String s="Hello world, this is Java!";
String[]s1=s.split(" ");
int count=0;
for(int i=0;i<s1.length;i++)
{
	count++;
}
System.out.println(count);
	}

}
