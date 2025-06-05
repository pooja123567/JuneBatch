package WebsiteAutomation.WebsiteAutomation;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicateElement {

	public static void main(String[] args) {
	int a[]= {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		/*String s="geeksforgeeks";
		boolean b[]=new boolean[s.length()];
		ArrayList<Character>list=new ArrayList();
		for(int i=0;i<s.length();i++)
			{
			if(b[i])
			{
				continue;
			}
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
			char ch1=s.charAt(j);
			if(ch==ch1)
			{
				if(!list.contains(ch))
				{
					System.out.print(ch);
              list.add(ch);
				}
				b[j]=true;
			}
			}
		}*/
		
	}

}
