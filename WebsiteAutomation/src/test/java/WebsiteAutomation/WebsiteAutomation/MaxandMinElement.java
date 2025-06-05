package WebsiteAutomation.WebsiteAutomation;

import java.util.Arrays;

public class MaxandMinElement {

	public static void main(String[] args) {
		int a[]= {3, 1, 7, 9, 2, 8};
		int min =minNo(a);
	int max= maxNo(a);
	System.out.println(min+" "+max);
	}
	public static int minNo(int a[])
	{
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
				
			}
			}

		return min;
			}
	
	public static int maxNo(int a[])
	{
		
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	return max;
	
	}

}

