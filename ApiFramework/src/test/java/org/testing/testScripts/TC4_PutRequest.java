package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest {
	@Test
	public static void test_case4() throws IOException
	{
	Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
	String requestbody= JsonHandle.loadJsonFile("../ApiFramework/src/test/java/org/testing/resources/UpdateJsonFile.json");
	requestbody=JsonReplacement.assignVariableValue(requestbody,"id",TC1_PostRequest.returnidvalue);
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.putmethod(requestbody,"URI_4",TC1_PostRequest.returnidvalue);
		ValidateResponse.validateStatusCode(200, res);
		//ValidateResponse.validateResponseData("Software engineer",res,"Designation");
		
	}


}
