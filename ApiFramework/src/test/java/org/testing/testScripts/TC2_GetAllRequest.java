package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetAllRequest {
	@Test
	public void testcase_2() throws IOException {
		Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
     HTTPMethods http=new HTTPMethods(pr);
	Response res=http.getmethod("URI_4");
	ValidateResponse.validateStatusCode(200, res);
	JsonParsingUsingOrgJson.jsonParsing(res.asString(),"firstname");
	}

}
