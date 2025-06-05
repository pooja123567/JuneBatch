package WebsiteAutomation.WebsiteAutomation;

import java.util.Scanner;

public class PrimeNoRange {

	public static void main(String[] args) {
		System.out.println("enter starting range");
		Scanner sc=new Scanner(System.in);
	int starting=sc.nextInt();
	System.out.println("enter ending range");
	Scanner sc1=new Scanner(System.in);
       int ending=sc1.nextInt();
       for(int i=starting;i<=ending;i++) 
       {
    	   int count=0;
    	   for(int j=1;j<=i;j++)
    	   {
    		   if(i%j==0)
    		   {
    			   count++;
    		   }
    		   
    	   }
    	   if(count==2)
    	   {
    		  System.out.print(i+" "); 
    	   }
    	   
       }
	}

}
