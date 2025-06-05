package WebsiteAutomation.WebsiteAutomation;

public class ArmstrongNo {

	public static void main(String[] args) {
		int n=9474;
	int original=n;
		double sum=0;
		int power=countDigit(n);
		while(n>0)
		{
			int rem=n%10;
			sum=sum+Math.pow(rem, power);
		    n=n/10;
		}
		if(original==sum)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("Not Armstrong no");
		}
		
	System.out.println(sum);
	}
	public static int countDigit(int m)
	{
	return String.valueOf(m).length();
	}


}
