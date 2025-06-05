package WebsiteAutomation.WebsiteAutomation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
	int a[]=  {1, 3, 5, 7, 9};
	int b[]= {2, 4, 6, 8, 10};
	int[]mergedarray=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
	System.out.print(Arrays.toString(mergedarray));
	int c[]=mergedArray(a,b);
System.out.print("merged array is"+Arrays.toString(c));
	}
	public static int[] mergedArray(int a[], int b[])
	{
		
	int n=a.length;
	int m=b.length;
	int mergedarray[]=new int[n+m];
	int i=0,j=0,k=0;
	while(i<n && j<m) {
		if(a[i]<b[j])
		{
			mergedarray[k++]=a[i++];
		
		}
		
		else {
			mergedarray[k++]=b[j++];
		}
	}
	while(i<n)
	{
		mergedarray[k++]=a[i++];
	}
	
	while(j<m)
	{
		mergedarray[k++]=b[j++];
	}
	
	
	return mergedarray;
		
	}
}
