package WebsiteAutomation.WebsiteAutomation;

public class SecondLargestNo {

	public static void main(String[] args) {
		int a[] = { 5, 3, 4, 1, 6, 9 };
	for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}

			}

		   }
		if(a.length>1)
		{
		int removeindex=1;
		int b[]=new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++)
			{
			if(i!=removeindex)
			{
				b[j++]=a[i];
				
			}
			
			
		}
		
for(int num:b)
{
	System.out.println(num);
}
		}

	}
}
