package org.testing.ResponseValidation;

import org.testing.Assertions.Assertion;
import org.testing.reportslogCapture.LogsCapture;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class ValidateResponse {
	public static void validateStatusCode(int expectedStatusCode,Response res,ExtentTest test,String classname)
	{
		//Assert.assertEquals(res.statusCode(),expectedStatusCode,"status code is not matching");//Hard assertion
		//System.out.println("status code is matching");
	boolean value =Assertion.assert1(expectedStatusCode, res);//soft assertion
	if(value)
	{
	test.log(LogStatus.PASS,"status code is matching with the Response");
	LogsCapture.takeLogs(classname,"status code is matching with the Response");
	
	}
	else
	{
	test.log(LogStatus.FAIL,"status code is not matching with the Response");
	LogsCapture.takeLogs(classname,"status code is not matching with the Response");
	}
	Assert.assertTrue(value);//last two lines will be example of both assertion
		
	}
	public static void validateResponseData(String expectedvalue,Response res,String Jsonpath)
	{
		String actualvalue=JsonParsingUsingJsonPath.jsonParsing(res,Jsonpath);
		boolean value =Assertion.assert2(expectedvalue,actualvalue);
		Assert.assertTrue(value);
	}	
}
