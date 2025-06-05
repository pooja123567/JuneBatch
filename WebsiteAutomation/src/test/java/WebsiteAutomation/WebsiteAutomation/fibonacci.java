package WebsiteAutomation.WebsiteAutomation;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.println("From which no you want to print fibonacci series");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=0;i<number;i++)
		{
		int c=a+b;
		a=b;
		b=c;
        System.out.print(" "+c);
		}
	}
	

}
