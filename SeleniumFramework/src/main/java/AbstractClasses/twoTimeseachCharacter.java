package AbstractClasses;

public class twoTimeseachCharacter {

	public static void main(String[] args) {
		String s="abcd";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
					for(int j=0;j<2;j++)
					{
						System.out.print(ch);
					}
		}
		
	
	
	
	}
}
