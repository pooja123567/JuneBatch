package org.testing.Assertions;

import io.restassured.response.Response;

public class Assertion {
	public static boolean assert1(int expectedstatuscode,Response res) {
		if(expectedstatuscode==res.statusCode())
		{
			System.out.println("status code is matching");
			return true;
		}
		else
			System.out.println("status code is not  matching");
			return false;
		
	}
		public static boolean assert2(String expectedvalue,String actualvalue) {
			if(expectedvalue.equals(actualvalue))
			{
				System.out.println("response data is matching");
				return true;
				
			}
			else
				System.out.println("response data is not matching");
				return false;
			
		}

}
