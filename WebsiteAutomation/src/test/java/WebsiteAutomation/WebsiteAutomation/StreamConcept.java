package WebsiteAutomation.WebsiteAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class StreamConcept {
	

	public static void main(String[]args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("ajay");
		al.add("nitin");
		al.add("abhishek");
		al.add("mohit");
		int count=0;
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			String s=al.get(i);
			if(s.startsWith("a"))
			{
				count++;
			}
		
	}
		System.out.println(count);
		usingFilterMethod();
		usingMapMethod();
		usingCollectMethod();
	}
	//this is about filter method
	public static void usingFilterMethod()
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("abhay");
		al.add("adhi");
		al.add("jain");
		al.add("himanshu");
		long y=al.stream().filter(x->x.startsWith("a")).count();
	System.out.println(y);
	long z=Stream.of("himanshu","ravita","mohina","rahu","kanchan").filter(i->
	//{
	//i.startsWith("r");
	i.startsWith("r")).count();
  // return true;
	//}).count();
		
	System.out.println(z);
	al.stream().filter(t->t.length()>4).forEach(t->System.out.println(t));
	//for only one result use limit terminal operation
	al.stream().filter(p->p.length()>4).limit(1).forEach(k->System.out.println(k));
	
	}
//after filter manipulation there is more manipulation need to be done for this map method to be used
	public static void usingMapMethod()
	{
		Stream.of("divya","himanshu","ravita","mohina","rahu","kanchan").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//arrays.asList is a method which convert array into a arraylist.
		System.out.println("in sorted form");
	List<String>newlist=Arrays.asList("divya","himanshu","ravita","mohina","rahu","kanchan");
	newlist.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println("printing the new String in sorted order");
	Stream<String>list1=Stream.of("neha","deepika");
	Stream<String>list2=Stream.of("rajat","mohina");
	Stream<String>newlist2=Stream.concat(list2,list1);
	//newlist2.sorted().forEach(s->System.out.println(s));
	boolean flag=newlist2.anyMatch(s->s.equalsIgnoreCase("rajat"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	
	}
	
	public static void usingCollectMethod()
	{
		Stream<String>al=Stream.of("hema","deepika","divya","jyoti");
		/*List<String>data=al.filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		for(String s:data)
		{
			System.out.print(s+" ");
		}*/
	al.filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).limit(1).forEach(s->System.out.println(s));
	int a[]= {3,2,2,7,5,1,9,7};
	//print unique number from array
    //sort 
	ArrayList<Integer>al1=new ArrayList<>(Arrays.asList(3,2,2,7,5,1,9,7));
	al1.stream().distinct().sorted().forEach(s->System.out.println(s));
	ArrayList<Integer>newone=(ArrayList<Integer>) al1.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("updated data "+newone.get(1));
	
	
	}
	

	
}


