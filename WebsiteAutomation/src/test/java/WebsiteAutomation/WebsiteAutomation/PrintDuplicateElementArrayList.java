package WebsiteAutomation.WebsiteAutomation;


import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicateElementArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,3,3,4,5,6,6,7,8,9,9,3,6));
		ArrayList<Integer>al1=new ArrayList<>();
		boolean b[]=new boolean[al.size()];
		for(int i=0;i<al.size();i++)
		{
			if(b[i])
			{
				continue;
			}
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					if(!al1.contains(al.get(i)))
					{
						System.out.print(al.get(i));
						al1.add(al.get(i));
					}
					b[j]=true;
					
					}
				
				
			}
		}

	}

}
