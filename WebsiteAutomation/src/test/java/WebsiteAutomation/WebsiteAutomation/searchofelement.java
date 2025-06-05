package WebsiteAutomation.WebsiteAutomation;

import java.util.Scanner;

public class searchofelement {

	public static void main(String[] args) {
		int a[]= {1,3,3,4,5,6,6,7,8,9,9};
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.print(i+" ");
				b=true;
			}
			
			
		}
	if(!b)
		System.out.print("element not found");
	}

}
