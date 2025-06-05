package WebsiteAutomation.WebsiteAutomation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String s1 = "   listen     ";
	        String s2 = "poojab";
	    boolean b =checkAnagram(s1,s2);
	     if(b)
	     {
	    	 System.out.println("Anagram");
	     }
	     else
	     {
	    	 System.out.println(" not Anagram");
	     }
	    	 
	     
	        
	}    
	        
	 public static  boolean checkAnagram(String s1,String s2)
	 {
		String newone=s1.replaceAll("\\s", "").toLowerCase();
		System.out.println(newone);
		String newone2=s2.replaceAll("\\s","").toLowerCase();
		if(newone.length()!=newone2.length())
		{
			return false;
		}
		char[]ch1=newone.toCharArray();
		char[]ch2=newone2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	
	 }

	

}
