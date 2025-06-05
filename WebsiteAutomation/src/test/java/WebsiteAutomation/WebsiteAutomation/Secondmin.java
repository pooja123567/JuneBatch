package WebsiteAutomation.WebsiteAutomation;

import java.util.Arrays;

public class Secondmin {

	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 1, 3};
		int [] arr1={10, 20, 20, 10, 30, 30, 30};;
		Integer a=secondMin(arr);
		System.out.println(a);
		Integer a1=secondMax(arr);
		System.out.println(a1);
	}
		public static Integer secondMin(int arr[])
		{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				
				{
					int temp=arr[i];
					arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		int min=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>min) {
			return arr[i];
		}
	}
	return  null;
	
		}
	
	public static Integer secondMax(int arr1[]) {
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
				arr1[j]=temp;
				}
			}
		}
		int max=arr1[0];
		for(int i=1;i<arr1.length;i++)
		{
		if(arr1[i]<max)
		{
		return arr1[i];	
		}
	}
		return null;
	}
}

