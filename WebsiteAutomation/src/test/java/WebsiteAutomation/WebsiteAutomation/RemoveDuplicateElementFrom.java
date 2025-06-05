package WebsiteAutomation.WebsiteAutomation;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElementFrom {

	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 5));
	ArrayList<Integer>newList=new ArrayList<>();
	for(int i=0;i<al.size();i++)
	{
	if(!newList.contains(al.get(i)))
	{
		newList.add(al.get(i));
	}
	}
System.out.println(newList);
}
}
