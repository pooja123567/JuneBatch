package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_DeleteRequest {
	@Test
	public static void test_case5() throws IOException {
		Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
    HTTPMethods http=new HTTPMethods(pr);
   Response res =http.deletemethod("URI_4",TC1_PostRequest.returnidvalue );
   ValidateResponse.validateStatusCode(200, res);
  // ValidateResponse.validateResponseData("Software engineer",res,"Designation");
    }
}
