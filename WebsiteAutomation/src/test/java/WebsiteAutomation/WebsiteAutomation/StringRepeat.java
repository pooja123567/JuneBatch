package WebsiteAutomation.WebsiteAutomation;

public class StringRepeat {

	public static void main(String[] args) {
		String s= "abcd" ;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
for(int j=0;j<2;j++)
{
	System.out.print(Character.toString(ch));
	
}
	}
//using String Builder
StringBuilder sb=new StringBuilder();
      for( char ch1: s.toCharArray())
      {
    	  sb.append(ch1).append(ch1);
      }
	System.out.println();
		System.out.print(sb.toString());		
	
	String s1="Automation";
	s1=s1.toLowerCase();
	boolean b[]=new boolean[s1.length()];
	for(int k=0;k<s1.length();k++) {
		if(b[k])
		{
			continue;
		}
	
		char ch2=s1.charAt(k);
	
	    int count=1;
	for(int l=k+1;l<s1.length();l++)
	{
		char ch3=s1.charAt(l);
		if(ch2==ch3)
		{
			count++;
			b[l]=true;
		}
		
	}
System.out.println();
System.out.println(ch2+" "+count);
	}
	
}
}