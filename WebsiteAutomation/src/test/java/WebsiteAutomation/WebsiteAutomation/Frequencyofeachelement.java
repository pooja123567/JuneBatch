package WebsiteAutomation.WebsiteAutomation;

public class Frequencyofeachelement {

	public static void main(String[] args) {
	int a[]= {1, 2, 3, 2, 1, 4, 5, 1, 2, 4, 3, 6};
	boolean b[]=new boolean[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(b[i])
		{
		break;	
		}
		int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				b[j]=true;
			}
		}
		System.out.println(a[i]+" "+count);
	}
	
	}

}
