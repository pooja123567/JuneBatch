package WebsiteAutomation.WebsiteAutomation;

import java.util.Scanner;

public class factorialandPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int n=sc.nextInt();
		System.out.println("Please enter power you want to calculate");
		int pow=sc.nextInt();
		/*int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
System.out.println(f);*/
		int p=1;
		for(int i=1;i<=pow;i++)
		{
			p=p*n;
		}
		System.out.print(p);
	
	}

}
