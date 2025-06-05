package WebsiteAutomation.WebsiteAutomation;

public class SecondSmallestandSecondLargest {

	public static void main(String[] args) {
		int a[]= {1,2,9,7,6,4,3,0};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		/*for(int b:a)
		{
			System.out.print(b+" ");	
		}
		System.out.println("printing output");*/
	//System.out.print(a[1]+" ");
	//System.out.print(a[a.length-2]);
	System.out.println(" "+a[1]);
	System.out.println(a[a.length-2]);
			
	}

}
