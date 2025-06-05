package WebsiteAutomation.WebsiteAutomation;

public class CharacterCount {

	public static void main(String[] args) {
		
		String s="GeeksforGeeks";
		boolean[]b=new boolean[s.length()];
		
		for(int i=0;i<s.length();i++)
       {
			
			if(b[i])
			{
				
				continue;
				}
	char ch=s.charAt(i);
	int count=1;
		for(int j=i+1;j<s.length();j++)
		{
		char ch1=s.charAt(j);
		if(ch==ch1)
		{
		count++;
		b[j]=true;
		
		}
		}
     System.out.println(ch+" "+count);	
		}
		}

}
