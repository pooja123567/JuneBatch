package AbstractClasses;

public class Nab {

	public static void main(String[] args) {
		String[]s= {"usa","newyork","aeiou"};
		for(int i=0;i<s.length;i++)
		{
		char ch[]=s[i].toCharArray();
		int count=0;
		for(int j=0;j<ch.length;j++)
		{
		if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
		{
		count++	;
		}
		
		}
		
		System.out.println(count);
	}

}
	
}
