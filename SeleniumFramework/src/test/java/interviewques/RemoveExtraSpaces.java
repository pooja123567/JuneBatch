package interviewques;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String input = "   This   is   a    test   string.   ";
		String input1=input.trim().replaceAll("\\s+"," ");
		System.out.println(input1);
		String s1="This is a test string";
		String reve="";
	String[] arr=s1.split(" ");
	for(int i=arr.length-1;i>=0;i--)
	{
		/*System.out.print(arr[i]+" ");
		StringBuffer sb=new StringBuffer("java");
		sb.append("java");
		System.out.println(sb);*/
		reve=reve+arr[i]+" ";
		reve.trim();
	}
	System.out.println(reve)	;
	}

}
