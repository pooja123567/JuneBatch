package interviewques;


import java.util.ArrayList;
import java.util.Arrays;



public class RemoveDuplictaeArraylist {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>(Arrays.asList(1,1,2,4,5,6,7,1,3,2,5));
		
		ArrayList<Integer>al1=new ArrayList<>();
		boolean b[]=new boolean[al.size()];
		/*for(int i=0;i<al.size(); i++)
		{
			if(!al1.contains(al.get(i)))
			{
				al1.add(al.get(i));
			}
		}

		System.out.println(al1);*/
		for(int i=0;i<al.size(); i++)
		{
			if(b[i])
			{
				continue;
			}
		for(int j=i+1;j<al.size();j++)
		{
		if(al.get(i)==al.get(j))
		{
			if(!al1.contains(al.get(i)))
			{
				al1.add(al.get(i));
			}
			b[j]=true;
		}
		
		}
		}
	System.out.println(al1);
}
}