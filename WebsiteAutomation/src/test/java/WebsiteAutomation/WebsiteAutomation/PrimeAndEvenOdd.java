package WebsiteAutomation.WebsiteAutomation;

import java.util.Scanner;

public class PrimeAndEvenOdd {

	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int count=0;
		for(int i=1;i<=m;i++)
		{
		int c=m%i;
		if(c==0)
		{
		count++;	
		}
		}
		if(count==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");	
		}
		

	}

}
