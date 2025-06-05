package WebsiteAutomation.WebsiteAutomation;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllElementThatappertwotimes {
	public static void main(String[]args) {
		int a[]= {1,1,2,4,5,6,7,1,3,2,5};
		
		boolean b[]=new boolean[a.length];
		ArrayList<Integer>list=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)
{
		if(b[i])
		{
			continue;
		}
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]==a[j])
		{
			if(!list.contains(a[i]))
					{
				list.add(a[i]);
					}
			b[j]=true;
		}
			
			}
	
		}
	
	Integer[]array=list.toArray(new Integer[0]);
	for(int a1:array)
	{
	System.out.println(a1)	;
	
	} 
	String s="hello";
	
	
}
}
