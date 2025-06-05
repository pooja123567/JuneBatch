package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrisationinTestng {
	
	
@Parameters({"URL"})
	@Test
	public void suiteLevelParameters(String url) {
		System.out.println("suite level parameters is present");
		System.out.println(url);
	}
	
	@Parameters({"username","password"})
	@Test
	public void testLevelParameters(String username,String pass) {
		System.out.println("test level parameter is present");
		System.out.println(username+" "+pass);
	}
	
	@Test(dataProvider="getData")
	public void classLevelParameters(String first,String last,String add)
	{
	System.out.println("class level Data");	
	System.out.println(first+" "+last+" "+add);
	}
	
	
	
	
	
	
	
	
	
	@DataProvider
	public static Object[][] getData()
	{
		Object[][]data=new Object[3][3];
		data[0][0]="firstname";
		data[0][1]="lastname";
		data[0][2]="address";
		data[1][0]="deepali";
		data[1][1]="joshi";
		data[1][2]="delhi";
		data[2][0]="mohina";
		data[2][1]="kumar";
		data[2][2]="haldwani";
	return data;	
		
		
		
	}

}
