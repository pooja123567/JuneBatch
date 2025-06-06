package interviewques;

public class Subarray {

	public static void main(String[] args) {
		int[] arr = {4, 2, 3, 1, 6};
	boolean b=subarray(arr);
	if(b)
	{
		System.out.println("subarray exists");
	}
	else
	{
		System.out.println("subarray not exists");	
	}
	}
	public static boolean subarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{ 
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum==0)
				{
					return true;
				}
			}
			
		}
return false;
	}
	
}
