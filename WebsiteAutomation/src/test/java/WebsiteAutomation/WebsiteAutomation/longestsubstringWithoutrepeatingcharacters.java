package WebsiteAutomation.WebsiteAutomation;

import java.util.List;
import java.util.ArrayList;

public class longestsubstringWithoutrepeatingcharacters {

	public static void main(String[] args) {
		String s="pwwkew";
		int start=0;
		int end=0;
		int max_length=0;
     List<Character>list=new ArrayList<Character>();
     while(end<s.length())
     {
    	 if(!list.contains(s.charAt(end))) 
    	 {
    		 list.add(s.charAt(end));
    		 end++;
    		 max_length=Math.max(max_length,list.size());
    	 }
    	 else
    	 {
    		 list.remove(Character.valueOf(s.charAt(start)));
    		 start++;    	 }
     }
    System.out.print(max_length);
		
		

	}

}
