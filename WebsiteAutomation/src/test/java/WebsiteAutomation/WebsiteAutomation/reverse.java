package WebsiteAutomation.WebsiteAutomation;

public class reverse {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int b[]=new int[a.length/2];
	int c[]=new int[a.length/2];
	
	
	for(int i=a.length/2-1,k=0;i>=0;i--)
	{
		b[k++]=a[i];
		}
	for(int i=a.length-1,k=0;i>=a.length/2;i--)
	{
		c[k++]=a[i];
	}
	for(int x:b)
	{
		System.out.print(" "+x);
	}
	for(int y:c)
	{
		System.out.print(" "+y);
	}

	}
	}
