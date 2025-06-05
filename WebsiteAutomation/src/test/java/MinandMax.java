import java.util.Arrays;

public class MinandMax {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,1,2};
		int min=a[0];
		int max=a[0];
		int maxindex=0;
		int minindex=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				minindex=i;
			}
			else if(a[i]>max)
			{
				max=a[i];
				maxindex=i;
			}
		}
		System.out.println(min+" "+minindex);
		System.out.println(max+" "+maxindex);
	
	}

}
