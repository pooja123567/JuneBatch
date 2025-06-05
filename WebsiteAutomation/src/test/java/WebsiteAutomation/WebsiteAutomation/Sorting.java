package WebsiteAutomation.WebsiteAutomation;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {0,7,6,4,3,2,1,4,8,0,3};
		int temp;
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[j];
			    a[j]=a[i];
			    a[i]=temp;
			} 
		}
		}
		
	
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
	}
}
