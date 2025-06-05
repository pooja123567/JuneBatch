import java.util.Arrays;

public class ReverseforSize {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int swap=5;
	for(int i=0;i<arr.length;i=i+swap)
	{
		int left=i;
		int right=Math.min(i+swap-1,arr.length-1);
		while(left<right)
		{
			int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
			
		}
		
	}
System.out.println(Arrays.toString(arr));
}
}