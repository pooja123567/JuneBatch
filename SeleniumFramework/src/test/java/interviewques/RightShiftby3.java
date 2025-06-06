package interviewques;

import java.util.Arrays;

public class RightShiftby3 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int k=3;
		rotateArray(a,k);
		System.out.println(Arrays.toString(a));

	}
	public static void rotateArray(int a[],int k)
	{
		if(a==null||a.length==0||k==0)
			return;
		int n=a.length;
		k=k%n;
		reverseArray(a,0,n-1);
		reverseArray(a,0,k-1);
		reverseArray(a,k,n-1);
	}
public static void reverseArray(int a[],int start,int end)
{
	while(start<end)
	{
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
}
}
