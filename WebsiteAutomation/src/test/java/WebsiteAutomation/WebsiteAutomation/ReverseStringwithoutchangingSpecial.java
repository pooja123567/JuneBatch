package WebsiteAutomation.WebsiteAutomation;

public class ReverseStringwithoutchangingSpecial {

	public static void main(String[] args) {
		String s="a b c d";
		String reversedString=reverse(s);
		System.out.println("original string "+s);
		System.out.println("reversed string "+reversedString);
		reverseFullString(s);
		
		
	}
		public static String reverse(String s) {
		
		char[] arr=s.toCharArray();
		int start=0;
		int end=arr.length-1;
				while(start<end)
		{
			//if(!Character.isLetterOrDigit(arr[start]))
					if(arr[start]==' ')
			{
				start++;
			}
			//else if(!Character.isLetterOrDigit(arr[end]))
					else if(arr[end]==' ')
			{
				end--;
			}
			else
			{
				char temp=arr[start];
				arr[start]=arr[end];
			     arr[end]=temp;
			     start++;
			     end--;
			     
				
			}
			
		}
		return new String(arr);
	}
		
		
	public static void reverseFullString(String s) {
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			temp=temp+ch;
		}
		System.out.println(temp);
		
	}

}
