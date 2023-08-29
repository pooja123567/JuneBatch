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

public class TC1_PostRequest {
	
	 static String returnidvalue;
@Test
public void testcase_1() throws IOException {
	 Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
	String requestbody= JsonHandle.loadJsonFile("../ApiFramework/src/test/java/org/testing/resources/RequestPayload.json");
	Random r=new Random();
	Integer number=r.nextInt();
	requestbody=JsonReplacement.assignVariableValue(requestbody,"id",number.toString());
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.postmethod(requestbody,"URI_4");
		ValidateResponse.validateStatusCode(201, res);
		ValidateResponse.validateResponseData("value",res,"firstname");
		returnidvalue=JsonParsingUsingOrgJson.jsonParsing(res.asString(),"id");

	}

}
